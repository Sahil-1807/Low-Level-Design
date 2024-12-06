package FoodDeliveryService.NotificationService;

import FoodDeliveryService.UserManager.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserNotificationPair{
    private String userId;
    private NotificationSender notificationSender;

    public UserNotificationPair(String userId, NotificationSender notificationSender) {
        this.userId = userId;
        this.notificationSender = notificationSender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public NotificationSender getNotificationSender() {
        return notificationSender;
    }

    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }
}
public class NotificationManager {
    private final static NotificationManager notificationManager  = new NotificationManager();
    Map<String, List<UserNotificationPair>> orderUserNotificationMap;
    private NotificationManager(){
        orderUserNotificationMap = new HashMap<>();
    }

    public static NotificationManager getInstance(){
        return notificationManager;
    }

    private boolean isContaining(String orderId, String userId, NotificationSender notificationSender){
        List<UserNotificationPair> pairs = orderUserNotificationMap.get(orderId);
        if(pairs == null || !pairs.contains(new UserNotificationPair(userId, notificationSender))){
            return false;
        }
        return true;
    }
    public void addNotificationSender(String orderId, String userId, NotificationSender notificationSender){
        List<UserNotificationPair> pairs = orderUserNotificationMap.get(orderId);
        UserNotificationPair userNotificationPair = new UserNotificationPair(userId, notificationSender);
        if(pairs == null){
            pairs = new ArrayList<>();
        }
        else if(isContaining(orderId, userId, notificationSender)){
            System.out.println("Error: the notification send exist already for this order.");
        }
        pairs.add(userNotificationPair);

        orderUserNotificationMap.put(orderId, pairs);
    }

    public void removeNoficationSender(String orderId, String userId, NotificationSender notificationSender){
        if(isContaining(orderId, userId, notificationSender)){
            List<UserNotificationPair> pairs = orderUserNotificationMap.get(orderId);
            for(UserNotificationPair userPair : pairs){
                if(userPair.getUserId().equals(userId) && userPair.getNotificationSender() == notificationSender){
                    pairs.remove(userPair);
                    break;
                }
            }
        }
        else{
            System.out.println("Error: the sender you want to delete with this order id is not present at the moment.");
        }
    }

    public void Notify(String orderId, String message){
        List<UserNotificationPair> pairs = orderUserNotificationMap.get(orderId);
        if(pairs == null){
            System.out.println("Error: There are no one to send notification for the order id : " + orderId);
            return;
        }
        for(UserNotificationPair pair : pairs){
            pair.getNotificationSender().sendNotification(pair.getUserId(), message);
        }
    }

    public void notifyPerticularUser(String userId, String message, NotificationSender notificationSender){
        notificationSender.sendNotification(userId, message);
    }

}
