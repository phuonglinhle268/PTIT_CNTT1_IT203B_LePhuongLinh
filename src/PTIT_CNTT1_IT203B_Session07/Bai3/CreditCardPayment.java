package PTIT_CNTT1_IT203B_Session07.Bai3;

public class CreditCardPayment implements CardPayable{
    @Override
    public void processCreditCard(double amount) {
        System.out.println("Xử lý thanh toán thẻ tín dụng: " + (long) amount + " - Thành công");
    }

    @Override
    public void pay(double amount) {
        processCreditCard(amount);
    }
}
