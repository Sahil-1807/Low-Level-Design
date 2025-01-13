import couponservice.Coupon;
import couponservice.CouponManager;
import couponservice.FixedDiscountRule;
import couponservice.PercentageDiscountRule;
import entities.Cart;
import entities.Item;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem(new Item("Laptop", 1000));
        cart.addItem(new Item("Headphones", 200));

        // Create coupons
        Coupon percentageCoupon = new PercentageDiscountRule(10); // 10% off
        Coupon fixedCoupon = new FixedDiscountRule(100);         // $100 off

        // Set up the coupon manager with a discount limit
        CouponManager couponManager = new CouponManager(150); // Max discount = $150

        // Apply coupons
        couponManager.addCoupon(percentageCoupon);
        couponManager.addCoupon(fixedCoupon);

        // Calculate total discount
        double totalDiscount = couponManager.applyCoupons(cart);

        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Price: $" + (cart.getTotalPrice() - totalDiscount));
    }
}