import RideBookingService.Driver.Driver;
import RideBookingService.Driver.DriverManager;
import RideBookingService.Enum.Rating;
import RideBookingService.Location;
import RideBookingService.Rider.Rider;
import RideBookingService.Rider.RiderManager;
import RideBookingService.TripService.Trip;
import RideBookingService.TripService.TripManager;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //---------------Creating Riders and Drivers--------------------------------
        Rider keertiRider = new Rider("Sahil", Rating.FIVE_STAR);
        Rider gauravRider = new Rider("Gaurav", Rating.FIVE_STAR);
        RiderManager riderMgr = RiderManager.getInstance();
        riderMgr.addRider("Sahil", keertiRider);
        riderMgr.addRider("Gaurav", gauravRider);

        Driver yogitaDriver = new Driver("Yogesh", Rating.THREE_STAR);
        Driver riddhiDriver = new Driver("Riddhi", Rating.FOUR_STAR);
        DriverManager driverMgr = DriverManager.getInstance();
        driverMgr.addDriver("Yogesh", yogitaDriver);
        driverMgr.addDriver("Riddhi", riddhiDriver);

        //These details in turn will be stored in database
        //-------------------------------------------------------------------------

        TripManager tripMgr = TripManager.getInstance();


        System.out.println("Creating Trip for Sahil from location (10,10) to (30,30)");
        tripMgr.createTrip(keertiRider, new Location(10, 10), new Location(30, 30));

        System.out.println("Creating Trip for Gaurav from location (200,200) to (500,500)");
        tripMgr.createTrip(gauravRider, new Location(200, 200), new Location(500, 500));


        //-------------------Display all the trips created--------------------------
        HashMap <Integer, Trip> tripsMap = tripMgr.getTripHashMap();
        for(Map.Entry<Integer, Trip> entry : tripsMap.entrySet()){
            entry.getValue().displayTripDetails();
        }
    }
}