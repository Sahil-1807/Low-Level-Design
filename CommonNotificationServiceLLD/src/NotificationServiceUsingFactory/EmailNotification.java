package NotificationServiceUsingFactory;

public class EmailNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Email to " + to + ": " + message);
    }
}


