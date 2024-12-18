package NotificationServiceUsingStrategy;

public class Main {
    public static void main(String[] args) {
        NotificationContext context = new NotificationContext();

        // Use Email Notification
        context.setNotificationStrategy(new EmailNotificationStrategy());
        context.sendNotification("user@example.com", "Welcome to Instagram!");

        // Use SMS Notification
        context.setNotificationStrategy(new SMSNotificationStrategy());
        context.sendNotification("1234567890", "Your order is out for delivery.");

        // Use Push Notification
        context.setNotificationStrategy(new PushNotificationStrategy());
        context.sendNotification("user123", "You have a new follower!");

        // Use WhatsApp Notification
        context.setNotificationStrategy(new WhatsAppNotificationStrategy());
        context.sendNotification("9876543210", "Your OTP is 12345.");
    }
}

