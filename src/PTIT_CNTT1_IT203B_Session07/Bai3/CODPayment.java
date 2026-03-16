package PTIT_CNTT1_IT203B_Session07.Bai3;

public class CODPayment implements CODPayable{
    @Override
    public void processCOD(double amount) {
        System.out.println("Xử lý thanh toán COD: " + (long) amount + " - Thành công");
    }

    @Override
    public void pay(double amount) {
        processCOD(amount);
    }
}
