package PTIT_CNTT1_IT203B_Session08.Bai6;

public class CODPayment implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Thanh toán khi nhận hàng: " + amount);
    }
}
