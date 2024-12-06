package FoodDeliveryService.FoodService;

import FoodDeliveryService.NotificationService.NotificationManager;
import FoodDeliveryService.NotificationService.SMSNotificationSender;
import FoodDeliveryService.ResturantService.Dish;
import FoodDeliveryService.ResturantService.Resturant;
import FoodDeliveryService.ResturantService.ResturantManager;

import java.util.Map;

public class FoodManager {
    private static final FoodManager foodManager = new FoodManager();
    private NotificationManager notificationManager;
    private ResturantManager resturantManager;

    private FoodManager(){

    }

    public static FoodManager getInstance(){
        return foodManager;
    }

    public void addResturantsForNotificationUpdate(String orderId, String resturantId){
        notificationManager = NotificationManager.getInstance();
        notificationManager.addNotificationSender(orderId, resturantId, new SMSNotificationSender());
    }
    public void prepareFood(String orderId, String resturantId, Map<Dish, Integer> dishes){
        resturantManager = ResturantManager.getInstance();
        Resturant resturant = resturantManager.getResturant(resturantId);
        resturant.prepareFood(orderId, dishes);

        addResturantsForNotificationUpdate(orderId, resturantId);
    }
}
