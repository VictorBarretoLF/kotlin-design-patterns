package cross.platform.notification.system

abstract class NotificationService {
    fun sendNotification(
        message: String,
        recipient: String,
    ) {
        val notification = createNotification()
        notification.send(message, recipient)
        println(notification.getDeliveryStatus())
    }

    abstract fun createNotification(): Notification
}
