package NotificationServiceUsingStrategy;

public class SMSNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}
