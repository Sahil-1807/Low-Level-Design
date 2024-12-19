package ParkingLotDesign.Models;

public class Vehicle {
    private String vehicleNumber;
    private VehicleCategory vehicleCategory;

    public Vehicle(String vehicleNumber, VehicleCategory vehicleCategory) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }
}
