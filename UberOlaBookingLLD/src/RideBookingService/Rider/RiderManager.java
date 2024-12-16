package RideBookingService.Rider;

import java.util.HashMap;

public class RiderManager {
    private static volatile RiderManager riderManager;
    private HashMap<String, Rider> riderMap = new HashMap<>();

    private RiderManager(){

    }

    public static RiderManager getInstance(){
        if(riderManager == null){
            synchronized (RiderManager.class){
                if(riderManager == null){
                    riderManager = new RiderManager();
                }
            }
        }
        return riderManager;
    }

    public void addRider(String name,Rider rider){
        riderMap.put(name, rider);
    }

    public Rider getRider(String name){
        return riderMap.get(name);
    }
}
