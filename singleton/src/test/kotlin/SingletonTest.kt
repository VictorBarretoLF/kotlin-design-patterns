import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertTimeout
import java.time.Duration
import java.util.concurrent.Callable
import java.util.concurrent.Executors

abstract class SingletonTest<S>(
    private val singletonInstanceMethod: () -> S,
) {
    @Test
    fun `test multiple calls and return the same object in same thread`() {
        // Create several instances in the same calling thread
        val instance1 = singletonInstanceMethod.invoke()
        val instance2 = singletonInstanceMethod.invoke()
        val instance3 = singletonInstanceMethod.invoke()
        // now check they are the same reference
        assertSame(instance1, instance2)
        assertSame(instance1, instance3)
        assertSame(instance2, instance3)
    }

    @Test
    fun `test multiple calls return the same object in different threads`() {
        assertTimeout(Duration.ofMillis(10000)) {
            // Create 10000 tasks and inside each callable instantiate the singleton class
            val tasks =
                (0 until 10000)
                    .map { Callable { singletonInstanceMethod.invoke() } }
                    .toCollection(ArrayList())

            // Use up to 8 concurrent threads to handle the tasks
            val executorService = Executors.newFixedThreadPool(8)
            val results = executorService.invokeAll(tasks)

            // wait for all the threads to complete
            val expectedInstance = singletonInstanceMethod.invoke()
            for (result in results) {
                val instance = result.get()
                assertNotNull(instance)
                assertSame(expectedInstance, instance)
            }

            // tidy up the executor
            executorService.shutdown()
        }
    }
}
