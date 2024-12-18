package NotificationServiceUsingStrategy;

public class WhatsAppNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String to, String message) {
        System.out.println("Sending WhatsApp Message to " + to + ": " + message);
    }
}
