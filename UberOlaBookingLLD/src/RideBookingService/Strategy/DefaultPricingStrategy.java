package RideBookingService.Strategy;

import RideBookingService.TripService.TripMetadata;

public class DefaultPricingStrategy implements PriceStrategy{
    @Override
    public double calculatePrice(TripMetadata tripMetadata) {
        System.out.println("Based on default strategy price is 100.");
        return 100.00;
    }
}
