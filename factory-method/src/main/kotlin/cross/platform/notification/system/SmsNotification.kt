package cross.platform.notification.system

class SmsNotification : Notification {
    override fun send(
        message: String,
        recipient: String,
    ) {
        println("Sending SMS to $recipient with message: $message")
    }

    override fun getDeliveryStatus(): String {
        return "SMS delivered successfully"
    }
}
