package FoodDeliveryService.UserManager;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static final UserManager userManager = new UserManager();
    private Map<String, User> userMap;
    private UserManager(){
        userMap = new HashMap<>();
    }

    public static UserManager getInstance(){
        return userManager;
    }

    public void addUser(String name, User user){
        userMap.put(name, user);
    }

    public User getUser(String name){
        return userMap.get(name);
    }
}
