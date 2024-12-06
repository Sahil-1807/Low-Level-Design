package FoodDeliveryService.StrategyService;

import FoodDeliveryService.DeliveryService.DeliveryMetaData;
import FoodDeliveryService.DeliveryService.partner.DeliveryPartner;
import FoodDeliveryService.DeliveryService.partner.DeliveryPartnerManager;
import FoodDeliveryService.StrategyService.IDeliveryPartnerMatchingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LocationBasedDeliveryPartnerMatching implements IDeliveryPartnerMatchingStrategy {
    @Override
    public List<DeliveryPartner> matchDeliveryPartners(DeliveryMetaData deliveryMetaData) {
        DeliveryPartnerManager deliveryPartnerManager = DeliveryPartnerManager.getInstance();
        List<DeliveryPartner> nearestDeliveryPartners = new ArrayList<>();

        // currently returning all but we can filter here itself on the basis of location
        for(Map.Entry<String, DeliveryPartner> entry : deliveryPartnerManager.getDeliveryPartnerMap().entrySet()){
            nearestDeliveryPartners.add(entry.getValue());
        }

        return nearestDeliveryPartners;
    }
}
