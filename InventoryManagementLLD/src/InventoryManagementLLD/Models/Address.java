package InventoryManagementLLD.Models;

public class Address {
    private int pinCode;
    private String city;
    private String state;

    public Address(int pinCode, String city, String state) {
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
