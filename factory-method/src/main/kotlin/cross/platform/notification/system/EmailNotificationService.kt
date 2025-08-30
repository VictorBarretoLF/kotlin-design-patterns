package cross.platform.notification.system

class EmailNotificationService : NotificationService() {
    override fun createNotification(): Notification {
        return EmailNotification()
    }
}
