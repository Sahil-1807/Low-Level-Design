package NotificationServiceUsingFactory;

public class WhatsAppNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending WhatsApp Message to " + to + ": " + message);
    }
}