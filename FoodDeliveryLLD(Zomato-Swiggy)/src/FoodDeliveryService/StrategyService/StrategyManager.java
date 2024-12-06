package FoodDeliveryService.StrategyService;

import FoodDeliveryService.DeliveryService.DeliveryMetaData;

public class StrategyManager {
    private static final StrategyManager strategyManager = new StrategyManager();
    private StrategyManager(){

    }

    public static StrategyManager getInstance(){
        return strategyManager;
    }

    public IDeliveryPartnerMatchingStrategy determineDeliveryPartnerMatchingStrategy(DeliveryMetaData deliveryMetaData){
        return new LocationBasedDeliveryPartnerMatching();
    }
}
