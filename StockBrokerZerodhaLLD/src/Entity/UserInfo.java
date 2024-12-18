package Entity;

import java.util.HashMap;
import java.util.Map;

public class UserInfo {
    private static Map<String, User> users = new HashMap<>();
    public static void addUser(String userId, User user){
        users.put(userId, user);
    }

    public static User getUser(String userId){
        return users.get(userId);
    }
}
