package RideBookingService.Strategy;

import RideBookingService.TripService.TripMetadata;

public interface PriceStrategy {
    public double calculatePrice(TripMetadata tripMetadata);
}
