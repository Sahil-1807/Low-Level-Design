package FoodDeliveryService.DeliveryService.partner;

import FoodDeliveryService.DeliveryService.DeliveryManager;
import FoodDeliveryService.DeliveryService.DeliveryMetaData;
import FoodDeliveryService.NotificationService.NotificationManager;

public class DeliveryPartner extends IPartner{
    private String name;
    public DeliveryPartner(String name) {
        super(name);
    }

    public void performDelivery(String orderId, DeliveryMetaData deliveryMetaData){
        NotificationManager notificationManager = NotificationManager.getInstance();
        notificationManager.Notify(orderId, name + " going to pickup the order from resturant location: " + deliveryMetaData.getResturantLocation());

        System.out.println("---------------------------------after 5 mintues-----------------------------------------");
        notificationManager.Notify(orderId, "picked up the order from resturant");
        System.out.println("----------------------------------after 1 mintue ----------------------------------------");
        notificationManager.Notify(orderId, "order is now out for delivery");
        System.out.println("---------------------------after 15 minutes----------------------------------------------");
        notificationManager.Notify(orderId, name + " reached the location: " + deliveryMetaData.getUserLocation());
        System.out.println("---------------------------after 1 minute -----------------------------------------------");
        notificationManager.Notify(orderId, "Order Delivered ! Thank you for ordering.");
    }
}
