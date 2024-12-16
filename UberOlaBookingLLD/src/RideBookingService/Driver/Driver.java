package RideBookingService.Driver;

import RideBookingService.Enum.Rating;

public class Driver {
    private String name;
    private boolean available;
    private Rating rating;

    public Driver(String name, Rating rating) {
        this.name = name;
        this.rating = rating;
        available = false;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public Rating getRating() {
        return rating;
    }
}
