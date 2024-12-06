package FoodDeliveryService.NotificationService;

public class SMSNotificationSender implements NotificationSender{
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("User : " + userId + " you have received a message: " + message);
    }
}
