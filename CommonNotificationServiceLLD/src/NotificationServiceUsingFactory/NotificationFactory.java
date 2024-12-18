package NotificationServiceUsingFactory;

public class NotificationFactory {
    public static Notification getNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            case "whatsapp":
                return new WhatsAppNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
