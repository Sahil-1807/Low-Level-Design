package NotificationServiceUsingFactory;

public class Main {
    public static void main(String[] args) {
        // Create the notification service
        NotificationService notificationService = new NotificationService();

        // Register notification types
        notificationService.registerNotification("email", new EmailNotification());
        notificationService.registerNotification("sms", new SMSNotification());
        notificationService.registerNotification("push", new PushNotification());
        notificationService.registerNotification("whatsapp", new WhatsAppNotification());

        // Send notifications
        notificationService.sendNotification("email", "user@example.com", "Welcome to Instagram!");
        notificationService.sendNotification("sms", "1234567890", "Your order is out for delivery.");
        notificationService.sendNotification("push", "user123", "You have a new follower!");
        notificationService.sendNotification("whatsapp", "1234567890", "Your OTP is 12345.");
    }
}

