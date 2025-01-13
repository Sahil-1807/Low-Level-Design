package couponservice;

import couponservice.Coupon;
import entities.Cart;

public class PercentageDiscountRule implements Coupon {
    private double percentage;

    public PercentageDiscountRule(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(Cart cart) {
        return cart.getTotalPrice() * (percentage / 100);
    }
}
