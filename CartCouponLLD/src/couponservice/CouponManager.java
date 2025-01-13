package couponservice;

import couponservice.CompositeCoupon;
import couponservice.Coupon;
import entities.Cart;

import java.util.ArrayList;
import java.util.List;

public class CouponManager {
    private List<Coupon> appliedCoupons = new ArrayList<>();
    private double maxDiscountLimit;

    public CouponManager(double maxDiscountLimit) {
        this.maxDiscountLimit = maxDiscountLimit;
    }

    public void addCoupon(Coupon coupon) {
        appliedCoupons.add(coupon);
        if (appliedCoupons.size() > 1) {
            switchToComposite();
        }
    }

    private void switchToComposite() {
        CompositeCoupon compositeCoupon = new CompositeCoupon();
        for (Coupon coupon : appliedCoupons) {
            compositeCoupon.addCoupon(coupon);
        }
        appliedCoupons.clear();
        appliedCoupons.add(compositeCoupon);
    }

    public double applyCoupons(Cart cart) {
        double totalDiscount = 0;

        for (Coupon coupon : appliedCoupons) {
            totalDiscount += coupon.calculateDiscount(cart);
        }

        return enforceLimit(totalDiscount);
    }

    private double enforceLimit(double discount) {
        return Math.min(discount, maxDiscountLimit);
    }
}
