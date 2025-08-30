package cross.platform.notification.system

class SmsNotificationService : NotificationService() {
    override fun createNotification(): Notification {
        return SmsNotification()
    }
}
