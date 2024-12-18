import Entity.Order;
import Entity.Stock;
import Entity.User;
import Enum.EXCHANGE;
import Enum.TXN_TYPE;
import Enum.ORDER_TYPE;
import Services.OrderManager;

public class Main {
    public static void main(String[] args) {
        User user = new User("sahil");
        Stock stock = new Stock(EXCHANGE.BSE, "Adani", 50);
        Order order = new Order(TXN_TYPE.BUY, ORDER_TYPE.LIMIT, 55, 10, stock, EXCHANGE.BSE);
        OrderManager orderManager = new OrderManager();
        orderManager.placeOrder("sahil", order);
    }
}