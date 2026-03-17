package PTIT_CNTT1_IT203B_Session08.Bai1;

public class FanFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        System.out.println("Đã tạo quạt mới.");
        return new Fan();
    }
}
