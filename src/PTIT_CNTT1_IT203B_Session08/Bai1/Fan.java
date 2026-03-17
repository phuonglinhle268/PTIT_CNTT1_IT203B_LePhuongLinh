package PTIT_CNTT1_IT203B_Session08.Bai1;

public class Fan implements Device{
    @Override
    public void turnOn() {
        System.out.println("Quạt bật.");
    }

    @Override
    public void turnOff() {
        System.out.println("Quạt tắt.");
    }
}
