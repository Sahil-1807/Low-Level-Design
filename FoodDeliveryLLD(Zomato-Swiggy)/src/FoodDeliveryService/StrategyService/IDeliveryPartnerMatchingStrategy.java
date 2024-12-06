package FoodDeliveryService.StrategyService;

import FoodDeliveryService.DeliveryService.DeliveryMetaData;
import FoodDeliveryService.DeliveryService.partner.DeliveryPartner;

import java.util.List;

public interface IDeliveryPartnerMatchingStrategy {
    public List<DeliveryPartner> matchDeliveryPartners(DeliveryMetaData deliveryMetaData);
}
