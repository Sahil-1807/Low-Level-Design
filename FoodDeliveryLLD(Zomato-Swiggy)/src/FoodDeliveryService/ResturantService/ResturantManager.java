package FoodDeliveryService.ResturantService;

import java.util.HashMap;
import java.util.Map;

public class ResturantManager {
    private static final ResturantManager resturantManager = new ResturantManager();
    private Map<String, Resturant> resturantMap;  // resturant id and resturant map
    private ResturantManager(){
        resturantMap = new HashMap<>();
    }

    public static ResturantManager getInstance(){
        return resturantManager;
    }

    public void addResturant(String resturantId, Resturant resturant){
        resturantMap.put(resturantId, resturant);
    }

    public Resturant getResturant(String resturantId){
        return resturantMap.get(resturantId);
    }
}
