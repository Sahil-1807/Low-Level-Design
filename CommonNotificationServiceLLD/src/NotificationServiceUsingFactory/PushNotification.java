package NotificationServiceUsingFactory;

public class PushNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Push Notification to " + to + ": " + message);
    }
}
