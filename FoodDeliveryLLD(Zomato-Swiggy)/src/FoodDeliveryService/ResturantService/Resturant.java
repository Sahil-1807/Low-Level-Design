package FoodDeliveryService.ResturantService;

import FoodDeliveryService.NotificationService.NotificationManager;

import java.util.Map;

public class Resturant {
    private String resturantId;
    private String name;
    private boolean isAvailable;
    private String location;
    private Menu menu;

    public Resturant(String resturantId, String name, String location, Menu menu) {
        this.resturantId = resturantId;
        this.name = name;
        this.location = location;
        this.menu = menu;
        isAvailable = true;
    }

    public String getResturantId() {
        return resturantId;
    }

    public void setResturantId(String resturantId) {
        this.resturantId = resturantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public boolean prepareFood(String orderId, Map<Dish, Integer> dishes){
        System.out.println("Resturant has accepted your order and started preparing it.");

        NotificationManager notificationManager = NotificationManager.getInstance();
        notificationManager.Notify(orderId, "Food is being prepared in the resturant.");

        System.out.println("-------------------------------After 15 minutes------------------------------------------");

        notificationManager.Notify(orderId, "Food is ready and can be picked from the resturant.");
        return true;
    }
}
