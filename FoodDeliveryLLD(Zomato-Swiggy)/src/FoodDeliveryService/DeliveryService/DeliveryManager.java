package FoodDeliveryService.DeliveryService;

import FoodDeliveryService.DeliveryService.partner.DeliveryPartner;
import FoodDeliveryService.NotificationService.NotificationManager;
import FoodDeliveryService.NotificationService.PushNotificationSender;
import FoodDeliveryService.StrategyService.IDeliveryPartnerMatchingStrategy;
import FoodDeliveryService.StrategyService.StrategyManager;

import java.util.List;

public class DeliveryManager {
    private static final DeliveryManager deliveryManager = new DeliveryManager();
    private DeliveryManager(){

    }

    public static DeliveryManager getInstance(){
        return deliveryManager;
    }

    public void manageDelivery(String orderId, DeliveryMetaData deliveryMetaData){
        StrategyManager strategyManager = StrategyManager.getInstance();
        IDeliveryPartnerMatchingStrategy partnerMatchingStrategy = strategyManager.determineDeliveryPartnerMatchingStrategy(deliveryMetaData);

        List<DeliveryPartner> deliveryPartners = partnerMatchingStrategy.matchDeliveryPartners(deliveryMetaData);

        NotificationManager notificationManager = NotificationManager.getInstance();
        for(DeliveryPartner partner : deliveryPartners){
            notificationManager.notifyPerticularUser(partner.getName(), "Delivery Request", new PushNotificationSender());
        }

        // assuming first partner accepted the request
        DeliveryPartner assignedPartner = deliveryPartners.get(0);
        notificationManager.Notify(orderId, "Delivery partner: " + assignedPartner.getName() + " has been assigned for the order delivery: " + orderId);
        assignedPartner.performDelivery(orderId, deliveryMetaData);
    }
}
