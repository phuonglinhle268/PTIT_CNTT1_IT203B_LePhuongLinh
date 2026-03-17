package PTIT_CNTT1_IT203B_Session08.Bai1;

public class AirConditioner implements Device{
    @Override
    public void turnOn() {
        System.out.println("Điều hòa bật.");
    }

    @Override
    public void turnOff() {
        System.out.println("Điều hòa tắt.");
    }
}
