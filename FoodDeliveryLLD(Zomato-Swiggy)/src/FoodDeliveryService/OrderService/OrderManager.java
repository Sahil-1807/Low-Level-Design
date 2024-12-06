package FoodDeliveryService.OrderService;

import FoodDeliveryService.DeliveryService.DeliveryManager;
import FoodDeliveryService.DeliveryService.DeliveryMetaData;
import FoodDeliveryService.FoodService.FoodManager;
import FoodDeliveryService.NotificationService.NotificationManager;
import FoodDeliveryService.NotificationService.SMSNotificationSender;

import java.util.Map;

public class OrderManager {
    private FoodManager foodManager;
    private DeliveryManager deliveryManager;
    private NotificationManager notificationManager;
    private Map<String, Order> orderMap;

    private static final OrderManager orderManager = new OrderManager();
    private OrderManager(){
        foodManager = FoodManager.getInstance();
        deliveryManager = DeliveryManager.getInstance();
        notificationManager = NotificationManager.getInstance();
    }

    public static OrderManager getInstance(){
        return orderManager;
    }

    public FoodManager getFoodManager() {
        return foodManager;
    }

    public void setFoodManager(FoodManager foodManager) {
        this.foodManager = foodManager;
    }

    public DeliveryManager getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(DeliveryManager deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public Map<String, Order> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }

    public void ManageDelivery(String orderId, Order order){
        DeliveryMetaData deliveryMetaData = new DeliveryMetaData(orderId, order.getUser().getLocation(), order.getResturant().getLocation());
        deliveryManager.manageDelivery(orderId, deliveryMetaData);
    }

    public void ManageFood(String orderId, Order order){
        foodManager.prepareFood(orderId, order.getResturant().getResturantId(), order.getOrderItems());
    }

    public void addUsersForNotificationUpdate(String orderId, Order order){
        notificationManager.addNotificationSender(orderId, order.getUser().getId(), new SMSNotificationSender());
    }

    public void createOrder(String orderId, Order order){
        addUsersForNotificationUpdate(orderId, order);
        ManageFood(orderId, order);
        ManageDelivery(orderId, order);
    }

    public Order getOrder(String orderId){
        return orderMap.get(orderId);
    }
}
