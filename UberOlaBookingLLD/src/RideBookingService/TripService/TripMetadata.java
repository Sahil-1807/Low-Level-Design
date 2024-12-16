package RideBookingService.TripService;

import RideBookingService.Location;
import RideBookingService.Enum.Rating;

public class TripMetadata {
    private Location sourceLocation;
    private Location destinationLocation;
    private Rating riderRating;
    private Rating driverRating;

    public TripMetadata(Location sourceLocation, Location destinationLocation, Rating riderRating) {
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.riderRating = riderRating;
        driverRating = Rating.UNASSIGNED;
    }

    public Rating getRiderRating() {
        return riderRating;
    }

    public Rating getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Rating driverRating) {
        this.driverRating = driverRating;
    }
}
