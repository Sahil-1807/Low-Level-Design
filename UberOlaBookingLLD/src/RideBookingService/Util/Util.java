package RideBookingService.Util;

import RideBookingService.Enum.Rating;

public class Util {

    public static int nextTripId = 1;
    public static String ratingToString(Rating rating){
        if(rating == Rating.ONE_STAR)return "one star";
        if(rating == Rating.TWO_STAR)return "two star";
        if(rating == Rating.THREE_STAR)return "three star";
        if(rating == Rating.FOUR_STAR)return "four star";
        if(rating == Rating.FIVE_STAR)return "five star";

        return "invalid string";
    }

    public static boolean isHighRating(Rating rating){
        if(rating == Rating.FOUR_STAR || rating == Rating.FIVE_STAR)return true;
        return false;
    }
}
