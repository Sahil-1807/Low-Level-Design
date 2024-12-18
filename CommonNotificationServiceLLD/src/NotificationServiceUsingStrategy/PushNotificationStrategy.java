package NotificationServiceUsingStrategy;

public class PushNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Push Notification to " + to + ": " + message);
    }
}