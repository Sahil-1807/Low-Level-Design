package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;
    private double totalPrice;

    public Cart(){
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public void removeItem(Item item) {
        items.remove(item);
        totalPrice -= item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
