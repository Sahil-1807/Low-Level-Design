package FoodDeliveryService.ResturantService;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private CUISINE cuisine;
    private String description;
    private double price;
    private List<DishAddOn> addons;

    public Dish(String name, CUISINE cuisine, double price) {
        this.name = name;
        this.cuisine = cuisine;
        this.price = price;
        addons = new ArrayList<>();
    }

    public double getPrice(){
        double totalCost = price;
        for(DishAddOn addOn : addons){
            totalCost += addOn.getPrice();
        }

        return totalCost;
    }

    public void addAddon(DishAddOn dishAddOn){
        addons.add(dishAddOn);
    }

    public String getName() {
        return name;
    }

    public CUISINE getCuisine() {
        return cuisine;
    }
}
