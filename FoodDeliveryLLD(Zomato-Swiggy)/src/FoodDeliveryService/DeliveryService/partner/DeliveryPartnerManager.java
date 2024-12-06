package FoodDeliveryService.DeliveryService.partner;

import FoodDeliveryService.DeliveryService.DeliveryManager;

import java.util.HashMap;
import java.util.Map;

public class DeliveryPartnerManager {
    private static final DeliveryPartnerManager deliveryPartnerManger = new DeliveryPartnerManager();
    private Map<String, DeliveryPartner> deliveryPartnerMap;

    private DeliveryPartnerManager(){
        deliveryPartnerMap = new HashMap<>();
    }

    public static DeliveryPartnerManager getInstance(){
        return deliveryPartnerManger;
    }

    public void setDeliveryPartnerMap(Map<String, DeliveryPartner> deliveryPartnerMap) {
        this.deliveryPartnerMap = deliveryPartnerMap;
    }

    public Map<String, DeliveryPartner> getDeliveryPartnerMap() {
        return deliveryPartnerMap;
    }

    public void addDeliveryPartner(String name, DeliveryPartner deliveryPartner){
        deliveryPartnerMap.put(name, deliveryPartner);
    }
}
