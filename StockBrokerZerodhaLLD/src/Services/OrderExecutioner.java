package Services;

import Entity.Order;

public class OrderExecutioner {
    public void placeOrder(String userId, Order order){
        ExchangeConnector.getInstance().sendOrderToExchange(userId, order);
    }
}
