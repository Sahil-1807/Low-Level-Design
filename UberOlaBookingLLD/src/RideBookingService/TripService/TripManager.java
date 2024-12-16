package RideBookingService.TripService;

import RideBookingService.Driver.Driver;
import RideBookingService.Location;
import RideBookingService.Rider.Rider;
import RideBookingService.Strategy.DriverMatchingStrategy;
import RideBookingService.Strategy.PriceStrategy;
import RideBookingService.Strategy.StrategyManager;

import java.util.HashMap;

public class TripManager {
    private static volatile TripManager tripManager;
    private HashMap<Integer, TripMetadata> tripMetadataHashMap = new HashMap<>();
    private HashMap<Integer, Trip> tripHashMap = new HashMap<>();
    private TripManager(){};

    public static TripManager getInstance(){
        if(tripManager == null){
            synchronized (TripManager.class){
                if(tripManager == null){
                    tripManager = new TripManager();
                }
            }
        }

        return tripManager;
    }

    public void createTrip(Rider rider, Location srcLocation, Location dstLocation){
        TripMetadata tripMetadata = new TripMetadata(srcLocation, dstLocation, rider.getRating());
        StrategyManager strategyManager = StrategyManager.getInstance();
        PriceStrategy priceStrategy = strategyManager.determinePricingStrategy(tripMetadata);
        DriverMatchingStrategy driverMatchingStrategy = strategyManager.determineDriverMatchingStrategy(tripMetadata);

        Driver driver = driverMatchingStrategy.matchDriver(tripMetadata);
        double totalPrice = priceStrategy.calculatePrice(tripMetadata);

        Trip trip = new Trip(rider, driver, srcLocation, dstLocation, totalPrice, priceStrategy, driverMatchingStrategy);
        int tripId = trip.getTripId();

        tripHashMap.put(tripId, trip);
        tripMetadataHashMap.put(tripId, tripMetadata);
    }

    public HashMap<Integer, Trip> getTripHashMap(){
        return tripHashMap;
    }
}
