package RideBookingService.Strategy;

import RideBookingService.Driver.Driver;
import RideBookingService.Driver.DriverManager;
import RideBookingService.TripService.TripMetadata;

import java.util.Iterator;
import java.util.Map;

public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy{
    @Override
    public Driver matchDriver(TripMetadata tripMetadata) {
        DriverManager driverManager = DriverManager.getInstance();
        if(driverManager.getDriverMap().isEmpty()){
            System.out.println("No drivers are avialable right now.");
        }

        System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of drivers and send notifications");
        Map<String, Driver> map = driverManager.getDriverMap();
        Iterator<Map.Entry<String, Driver>> iterator = map.entrySet().iterator();

        Driver  driver = iterator.next().getValue();
        System.out.println("Setting the Driver " + driver.getName());
        tripMetadata.setDriverRating(driver.getRating());
        return driver;
    }
}
