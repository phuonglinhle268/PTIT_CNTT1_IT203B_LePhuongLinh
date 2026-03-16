package PTIT_CNTT1_IT203B_Session07.Bai5;

public class MomoPayment implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Thanh toán MoMo: " + amount);
    }
}
