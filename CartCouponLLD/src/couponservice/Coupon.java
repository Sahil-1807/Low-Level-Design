package couponservice;

import entities.Cart;

public interface Coupon {
    double calculateDiscount(Cart cart);
}

