package ParkingLotDesign.Models;

import java.util.UUID;

public class Ticket {
    private String ticketNumber;
    private long startTime;
    private long endTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;

    public Ticket(Vehicle vehicle, ParkingSlot parkingSlot) {
        this.ticketNumber = UUID.randomUUID().toString();
        this.startTime = System.currentTimeMillis();
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
}
