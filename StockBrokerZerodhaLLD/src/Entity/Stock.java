package Entity;

import Enum.EXCHANGE;
public class Stock {
    private EXCHANGE exchange;
    private String name;
    private double price;

    public Stock(EXCHANGE exchange, String name, double price) {
        this.exchange = exchange;
        this.name = name;
        this.price = price;
    }


}
