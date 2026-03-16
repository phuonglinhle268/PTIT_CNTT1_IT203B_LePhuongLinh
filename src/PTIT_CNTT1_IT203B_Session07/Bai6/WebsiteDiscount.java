package PTIT_CNTT1_IT203B_Session07.Bai6;

public class WebsiteDiscount implements DiscountStrategy{
    public double applyDiscount(double total) {
        System.out.println("Áp dụng giảm giá 10% cho đơn hàng website");
        return total * 0.9;
    }
}
