package PTIT_CNTT1_IT203B_Session07.Bai3;

public class MomoPayment implements EWalletPayable{
    @Override
    public void processMomo(double amount) {
        System.out.println("Xử lý thanh toán MoMo: " + (long) amount + " - Thành công");
    }

    @Override
    public void pay(double amount) {
        processMomo(amount);
    }
}
