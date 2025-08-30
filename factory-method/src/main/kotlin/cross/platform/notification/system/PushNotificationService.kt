package cross.platform.notification.system

class PushNotificationService : NotificationService() {
    override fun createNotification(): Notification {
        return PushNotification()
    }
}
