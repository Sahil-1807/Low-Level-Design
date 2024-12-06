package FoodDeliveryService.DeliveryService.partner;

public class IPartner {
    private String name;
    private RATING rating;

    public IPartner(String name) {
        this.name = name;
        rating = RATING.UNASSIGNED;
    }

    public String getName() {
        return name;
    }
}
