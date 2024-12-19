package ParkingLotDesign.ParkingLotService;

import ParkingLotDesign.Models.ParkingSlot;
import ParkingLotDesign.Models.ParkingSlotType;
import ParkingLotDesign.Models.Vehicle;
import ParkingLotDesign.Models.VehicleCategory;

import java.util.Map;

public class ParkingFloor {
    private String name;
    private Map<ParkingSlotType,Map<String, ParkingSlot>> parkingSlots;
    public ParkingFloor(String name , Map<ParkingSlotType,Map<String,ParkingSlot>> parkingSlots) {
        this.name=name;
        this.parkingSlots = parkingSlots;
    }

    public String getName() {
        return name;
    }

    public Map<ParkingSlotType, Map<String, ParkingSlot>> getParkingSlots() {
        return parkingSlots;
    }

    public ParkingSlot getRelevantSlotForVehicleAndPark(Vehicle vehicle) {
        System.out.println("trying to find the relevent slot for vehicle : " + vehicle.getVehicleNumber());
        VehicleCategory vehicleCategory = vehicle.getVehicleCategory();
        ParkingSlotType parkingSlotType = pickCorrectSlot(vehicleCategory);
        Map<String,ParkingSlot> relevantParkingSlot = parkingSlots.get(parkingSlotType);
        ParkingSlot slot =null ;
        for(Map.Entry<String,ParkingSlot> m : relevantParkingSlot.entrySet()){
            if(m.getValue().isAvailable()) {
                slot = m.getValue();
                slot.addVehicle(vehicle);
                break;
            }
        }

        return slot;
    }

    private ParkingSlotType pickCorrectSlot(VehicleCategory vehicleCategory) {
        System.out.println("Mathcing the correct slot for the vehicle ie: " + vehicleCategory);
        if(vehicleCategory.equals(VehicleCategory.TwoWheeler)) return ParkingSlotType.TwoWheeler;
        else if(vehicleCategory.equals(VehicleCategory.Hatchback) || vehicleCategory.equals(VehicleCategory.Sedan)) return ParkingSlotType.Compact;
        else if(vehicleCategory.equals(VehicleCategory.SUV)) return ParkingSlotType.Medium;
        else if(vehicleCategory.equals(VehicleCategory.Bus)) return ParkingSlotType.Large;
        return null;
    }
}
