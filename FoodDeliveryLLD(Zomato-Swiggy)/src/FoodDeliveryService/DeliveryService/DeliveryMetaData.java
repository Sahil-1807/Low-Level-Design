package FoodDeliveryService.DeliveryService;

public class DeliveryMetaData {
    private String orderId;
    private String userLocation;
    private String resturantLocation;

    public DeliveryMetaData(String orderId, String userLocation, String resturantLocation) {
        this.orderId = orderId;
        this.userLocation = userLocation;
        this.resturantLocation = resturantLocation;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public String getResturantLocation() {
        return resturantLocation;
    }
}
