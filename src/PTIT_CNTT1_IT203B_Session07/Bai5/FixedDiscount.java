package PTIT_CNTT1_IT203B_Session07.Bai5;

public class FixedDiscount implements DiscountStrategy{
    double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    public double applyDiscount(double total) {
        return total - amount;
    }
}
