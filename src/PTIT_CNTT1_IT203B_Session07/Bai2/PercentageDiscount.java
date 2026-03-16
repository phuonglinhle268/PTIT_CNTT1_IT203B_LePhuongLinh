package PTIT_CNTT1_IT203B_Session07.Bai2;

public class PercentageDiscount implements DiscountStrategy{
    double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - totalAmount * percent / 100;
    }
}
