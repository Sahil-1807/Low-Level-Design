package NotificationServiceUsingStrategy;

public class NotificationContext {
    private NotificationStrategy notificationStrategy;

    // Set the notification strategy dynamically
    public void setNotificationStrategy(NotificationStrategy strategy) {
        this.notificationStrategy = strategy;
    }

    // Delegate the send operation to the strategy
    public void sendNotification(String to, String message) {
        if (notificationStrategy == null) {
            throw new IllegalStateException("Notification strategy is not set.");
        }
        notificationStrategy.send(to, message);
    }
}
