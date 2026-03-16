package PTIT_CNTT1_IT203B_Session07.Bai5;

public class HolidayDiscount implements DiscountStrategy{
    public double applyDiscount(double total) {
        return total * 0.85;
    }
}
