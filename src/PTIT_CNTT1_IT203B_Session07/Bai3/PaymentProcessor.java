package PTIT_CNTT1_IT203B_Session07.Bai3;

public class PaymentProcessor {
    PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.pay(amount);
    }
}
