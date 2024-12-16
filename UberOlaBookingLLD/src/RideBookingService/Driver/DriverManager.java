package RideBookingService.Driver;

import java.util.HashMap;

public class DriverManager {
    private HashMap<String, Driver> driverMap = new HashMap<>();
    private DriverManager(){};

    private static class  Helper{
        private static final DriverManager driverManager = new DriverManager();
    }

    public static DriverManager getInstance(){
        return Helper.driverManager;
    }

    public void addDriver(String name, Driver driver){
        driverMap.put(name, driver);
    }

    public Driver getDriver(String name){
        return driverMap.get(name);
    }

    public HashMap<String, Driver> getDriverMap() {
        return driverMap;
    }
}
