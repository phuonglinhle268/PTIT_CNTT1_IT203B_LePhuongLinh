package PTIT_CNTT1_IT203B_Session08.Bai6;

public class CreditCardPayment implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Thanh toán thẻ tín dụng: " + amount);
    }
}
