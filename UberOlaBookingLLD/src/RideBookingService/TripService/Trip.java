package RideBookingService.TripService;

import RideBookingService.Driver.Driver;
import RideBookingService.Driver.DriverManager;
import RideBookingService.Enum.TRIP_STATUS;
import RideBookingService.Location;
import RideBookingService.Rider.Rider;
import RideBookingService.Strategy.DriverMatchingStrategy;
import RideBookingService.Strategy.PriceStrategy;
import RideBookingService.Util.Util;

public class Trip {
    private Rider rider;
    private Driver driver;
    private Location sourceLocation;
    private Location destinationLocation;
    private TRIP_STATUS tripStatus;
    private int tripId;
    private double price;
    private PriceStrategy priceStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;

    public Trip(Rider rider, Driver driver, Location sourceLocation, Location destinationLocation, double price,
                PriceStrategy priceStrategy, DriverMatchingStrategy driverMatchingStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.price = price;
        this.priceStrategy = priceStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;

        tripStatus = TRIP_STATUS.DRIVER_ON_THE_WAY;
        tripId = Util.nextTripId;
        Util.nextTripId++;
    }

    public int getTripId(){
        return tripId;
    }

    public void displayTripDetails(){
        System.out.println("Trip id: " + tripId);
        System.out.println("Rider: " + rider.getName());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Price is: " + price);
        System.out.println("Source location is : "+ sourceLocation + " and destination location is : " + destinationLocation);
    }


}
