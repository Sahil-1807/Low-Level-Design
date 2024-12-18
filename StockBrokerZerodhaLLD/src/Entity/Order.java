package Entity;

import Enum.TXN_TYPE;
import Enum.ORDER_TYPE;
import Enum.EXCHANGE;
public class Order {
    private TXN_TYPE txnType;
    private ORDER_TYPE orderType;
    private double price;
    private int quantity;
    private Stock stock;
    private EXCHANGE exchange;

    public Order(TXN_TYPE txnType, ORDER_TYPE orderType, double price, int quantity, Stock stock, EXCHANGE exchange) {
        this.txnType = txnType;
        this.orderType = orderType;
        this.price = price;
        this.quantity = quantity;
        this.stock = stock;
        this.exchange = exchange;
    }

    public TXN_TYPE getTxnType() {
        return txnType;
    }

    public ORDER_TYPE getOrderType() {
        return orderType;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public EXCHANGE getExchange() {
        return exchange;
    }
}
