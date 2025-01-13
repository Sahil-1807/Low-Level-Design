package couponservice;

import couponservice.Coupon;
import entities.Cart;

import java.util.ArrayList;
import java.util.List;

public class CompositeCoupon implements Coupon {
    private List<Coupon> coupons = new ArrayList<>();

    public void addCoupon(Coupon coupon) {
        coupons.add(coupon);
    }

    @Override
    public double calculateDiscount(Cart cart) {
        double totalDiscount = 0;
        for (Coupon coupon : coupons) {
            totalDiscount += coupon.calculateDiscount(cart);
        }
        return totalDiscount;
    }
}
