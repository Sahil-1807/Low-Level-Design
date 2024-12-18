package Services;

import Entity.Order;

public class OrderManager {
    private OrderValidator orderValidator;
    private OrderExecutioner orderExecutioner;

    public OrderManager() {
        orderValidator = new OrderValidator();
        orderExecutioner = new OrderExecutioner();
    }

    public void placeOrder(String userId, Order order){
        if(orderValidator.ValidateOrder(userId, order)){
            orderExecutioner.placeOrder(userId, order);
        }
    }
}
