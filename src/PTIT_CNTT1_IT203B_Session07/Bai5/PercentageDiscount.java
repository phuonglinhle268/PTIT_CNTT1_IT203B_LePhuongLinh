package PTIT_CNTT1_IT203B_Session07.Bai5;

public class PercentageDiscount implements DiscountStrategy{
    double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    public double applyDiscount(double total) {
        return total - total * percent / 100;
    }
}
