package RideBookingService.Strategy;

import RideBookingService.Driver.Driver;
import RideBookingService.TripService.TripMetadata;

public interface DriverMatchingStrategy {
    public Driver matchDriver(TripMetadata tripMetadata);
}
