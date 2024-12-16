package RideBookingService.Strategy;

import RideBookingService.TripService.TripMetadata;
import RideBookingService.Util.Util;

public class RatingBasedPricingStrategy implements PriceStrategy{
    @Override
    public double calculatePrice(TripMetadata tripMetadata) {
        double price = Util.isHighRating(tripMetadata.getRiderRating()) ? 55 : 65;
        System.out.println("Based on " + Util.ratingToString(tripMetadata.getRiderRating()) + "rider rating the fare price is "+ price);
        return price;
    }
}
