package FoodDeliveryService.OrderService;

import FoodDeliveryService.ResturantService.Dish;
import FoodDeliveryService.ResturantService.Resturant;
import FoodDeliveryService.UserManager.User;

import java.util.Map;

public class Order {
    private String orderId;
    private User user;
    private Resturant resturant;
    private Map<Dish, Integer> orderItems;
    private String discountCode;
    private String paymentId;
    private ORDER_STATUS orderStatus;

    public Order(String orderId, User user, Resturant resturant, Map<Dish, Integer> orderItems) {
        this.orderId = orderId;
        this.user = user;
        this.resturant = resturant;
        this.orderItems = orderItems;
        this.orderStatus = ORDER_STATUS.PLACED;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Resturant getResturant() {
        return resturant;
    }

    public void setResturant(Resturant resturant) {
        this.resturant = resturant;
    }

    public Map<Dish, Integer> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Map<Dish, Integer> orderItems) {
        this.orderItems = orderItems;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public ORDER_STATUS getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(ORDER_STATUS orderStatus) {
        this.orderStatus = orderStatus;
    }
}
