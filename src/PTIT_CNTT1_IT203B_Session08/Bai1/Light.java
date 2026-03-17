package PTIT_CNTT1_IT203B_Session08.Bai1;

public class Light implements Device{
    @Override
    public void turnOn() {
        System.out.println("Đèn: Bật sáng.");
    }

    @Override
    public void turnOff() {
        System.out.println("Đèn: Tắt.");
    }
}
