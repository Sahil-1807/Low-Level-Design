package FoodDeliveryService.NotificationService;

public class PushNotificationSender implements NotificationSender{
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("for user: " + userId + " order status is : " + message);
    }
}
