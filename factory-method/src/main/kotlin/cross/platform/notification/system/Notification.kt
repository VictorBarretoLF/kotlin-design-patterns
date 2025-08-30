package cross.platform.notification.system

interface Notification {
    fun send(
        message: String,
        recipient: String,
    )

    fun getDeliveryStatus(): String
}
