package FoodDeliveryService.StrategyService;

import FoodDeliveryService.DeliveryService.DeliveryMetaData;
import FoodDeliveryService.StrategyService.DeliveryChargeCalculationStrategy;

public class LocationBasedDeliveryChargeCalculator implements DeliveryChargeCalculationStrategy {
    @Override
    public double calculateDeliveryCharge(DeliveryMetaData deliveryMetaData) {
        System.out.println("Delivery charge is 20 as default for now and we can change it in future as per the data");
        return 20;
    }
}
