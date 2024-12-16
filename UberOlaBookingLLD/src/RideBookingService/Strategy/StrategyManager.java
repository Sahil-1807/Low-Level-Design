package RideBookingService.Strategy;

import RideBookingService.TripService.TripMetadata;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Stack;

public class StrategyManager {
    private StrategyManager(){};

    private static class Helper{
        private static final StrategyManager strategyManager = new StrategyManager();
    }

    public static StrategyManager getInstance(){
        return Helper.strategyManager;
    }

    public PriceStrategy determinePricingStrategy(TripMetadata tripMetadata){
        System.out.println("Based on location and other factors, setting pricing strategy");
        return new DefaultPricingStrategy();
    }

    public DriverMatchingStrategy determineDriverMatchingStrategy(TripMetadata tripMetadata){
        System.out.println("Based on location and other factors, setting matching strategy");
        return new LeastTimeBasedMatchingStrategy();
    }
}
