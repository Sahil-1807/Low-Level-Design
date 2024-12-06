import FoodDeliveryService.DeliveryService.partner.DeliveryPartner;
import FoodDeliveryService.DeliveryService.partner.DeliveryPartnerManager;
import FoodDeliveryService.DeliveryService.partner.ResturantOwner;
import FoodDeliveryService.OrderService.Order;
import FoodDeliveryService.OrderService.OrderManager;
import FoodDeliveryService.ResturantService.*;
import FoodDeliveryService.UserManager.User;
import FoodDeliveryService.UserManager.UserManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        ResturantOwner resturantOwner1 = new ResturantOwner("owner1");
        Dish noodles = new Dish("noodles", CUISINE.CHINESE, 150);
        noodles.addAddon(new DishAddOn("Premium Sauce", "Sauce to eat noodles wiht", 30));
        Dish fried_rice = new Dish("Fried Rice", CUISINE.CHINESE, 120);
        Dish spring_rolls = new Dish("Spring Rolls", CUISINE.CHINESE, 180);
        List<Dish> dishList1 = new ArrayList<>(){{add(noodles); add(fried_rice); add(spring_rolls);}};
        Menu menu1 = new Menu(dishList1);
        Resturant resturant1 = new Resturant("resturant1", "China Town", "Mahadevpura", menu1);

        ResturantOwner resturantOwner2 = new ResturantOwner("owner2");
        Dish dosa = new Dish("Dosa", CUISINE.SOUTH_INDIAN, 120);
        Dish idli = new Dish("Idli", CUISINE.SOUTH_INDIAN, 60);
        Dish uttpam = new Dish("Uttpam", CUISINE.SOUTH_INDIAN, 100);
        List<Dish> dishList2 = new ArrayList<>(){{add(dosa); add(idli); add(uttpam);}};
        Menu menu2 = new Menu(dishList2);
        Resturant resturant2 = new Resturant("resturant2", "Udupi", "Marathahalli", menu2);

        ResturantManager resturantManager = ResturantManager.getInstance();
        resturantManager.addResturant("resturant1", resturant1);
        resturantManager.addResturant("resturant2", resturant2);

        DeliveryPartner alpha = new DeliveryPartner("alpha");
        DeliveryPartner beta = new DeliveryPartner("beta");
        DeliveryPartner gamma = new DeliveryPartner("gamma");

        DeliveryPartnerManager deliveryPartnerManager = DeliveryPartnerManager.getInstance();
        deliveryPartnerManager.addDeliveryPartner("alpha", alpha);
        deliveryPartnerManager.addDeliveryPartner("beta", beta);
        deliveryPartnerManager.addDeliveryPartner("gamma", gamma);

        User Sahil = new User("user1", "sahil");
        User Jay = new User("user2", "jay");
        User Devansh = new User("user3", "devansh");

        UserManager userManager = UserManager.getInstance();
        userManager.addUser("sahil", Sahil);
        userManager.addUser("jay", Jay);
        userManager.addUser("devansh", Devansh);

        Map<Dish, Integer> cart = new HashMap<>();
        cart.put(noodles, 1);
        cart.put(fried_rice, 2);
        Order order = new Order("order1", Sahil, resturant1, cart);

        OrderManager orderManager = OrderManager.getInstance();
        orderManager.createOrder("order1", order);
    }
}