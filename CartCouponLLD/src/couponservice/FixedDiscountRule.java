package couponservice;

import entities.Cart;

public class FixedDiscountRule implements Coupon {
    private double fixedAmount;

    public FixedDiscountRule(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double calculateDiscount(Cart cart) {
        return Math.min(fixedAmount, cart.getTotalPrice());
    }
}
