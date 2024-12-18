package NotificationServiceUsingFactory;

public class SMSNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}