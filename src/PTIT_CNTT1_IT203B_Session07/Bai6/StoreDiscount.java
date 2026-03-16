package PTIT_CNTT1_IT203B_Session07.Bai6;

public class StoreDiscount implements DiscountStrategy{
    public double applyDiscount(double total) {
        System.out.println("Áp dụng giảm giá thành viên 5%");
        return total * 0.95;
    }
}
