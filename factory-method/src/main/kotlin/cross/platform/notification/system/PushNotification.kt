package cross.platform.notification.system

class PushNotification : Notification {
    override fun send(
        message: String,
        recipient: String,
    ) {
        println("Sending Push Notification to $recipient with message: $message")
    }

    override fun getDeliveryStatus(): String {
        return "Push Notification delivered successfully"
    }
}
