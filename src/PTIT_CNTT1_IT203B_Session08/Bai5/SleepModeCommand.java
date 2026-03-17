package PTIT_CNTT1_IT203B_Session08.Bai5;

public class SleepModeCommand implements Command{
    Light light;
    Fan fan;
    AirConditioner ac;

    public SleepModeCommand(Light light, Fan fan, AirConditioner ac) {
        this.light = light;
        this.fan = fan;
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("SleepMode: Tắt đèn");
        System.out.println("SleepMode: Điều hòa 28°C");
        System.out.println("SleepMode: Quạt tốc độ thấp");

        light.off();
        ac.setTemperature(28);
        fan.low();
    }
}
