package cross.platform.notification.system

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        println("=== Cross-Platform Notification System Demo ===\n")

        testPersonalService()
        testBusinessService()
        testMobileAppService()
    }

    private fun testPersonalService() {
        println("--- Personal Notification Service ---")
        val service = SmsNotificationService()
        service.sendNotification("Welcome to our platform!", "john@example.com")
    }

    private fun testBusinessService() {
        println("--- Business Notification Service ---")
        val service = EmailNotificationService()
        service.sendNotification("Your order has been shipped", "+1234567890")
    }

    private fun testMobileAppService() {
        println("--- Mobile App Notification Service ---")
        val service = PushNotificationService()
        service.sendNotification("You have a new message!", "user123")
    }
}
