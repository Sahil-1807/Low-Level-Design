package NotificationServiceUsingStrategy;

public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Email to " + to + ": " + message);
    }
}
