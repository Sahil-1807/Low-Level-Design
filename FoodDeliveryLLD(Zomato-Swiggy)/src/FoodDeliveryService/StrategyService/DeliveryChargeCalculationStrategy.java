package FoodDeliveryService.StrategyService;

import FoodDeliveryService.DeliveryService.DeliveryMetaData;
import FoodDeliveryService.DeliveryService.partner.DeliveryPartner;

public interface DeliveryChargeCalculationStrategy {
    public double calculateDeliveryCharge(DeliveryMetaData deliveryMetaData);
}
