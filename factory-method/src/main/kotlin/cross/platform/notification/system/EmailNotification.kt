package cross.platform.notification.system

class EmailNotification : Notification {
    override fun send(
        message: String,
        recipient: String,
    ) {
        println("Sending Email to $recipient with message: $message")
    }

    override fun getDeliveryStatus(): String {
        return "Email delivered successfully"
    }
}
