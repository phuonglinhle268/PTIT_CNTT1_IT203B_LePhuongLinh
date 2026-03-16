package PTIT_CNTT1_IT203B_Session07.Bai6;

public class MobileDiscount implements DiscountStrategy{
    public double applyDiscount(double total) {
        System.out.println("Áp dụng giảm giá 15% cho lần đầu");
        return total * 0.85;
    }
}
