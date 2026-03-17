package PTIT_CNTT1_IT203B_Session08.Bai1;

public class AirConditionerFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        System.out.println("Đã tạo điều hòa mới.");
        return new AirConditioner();
    }
}
