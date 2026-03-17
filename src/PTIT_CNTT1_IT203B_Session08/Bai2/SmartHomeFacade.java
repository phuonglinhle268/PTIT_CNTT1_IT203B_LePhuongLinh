package PTIT_CNTT1_IT203B_Session08.Bai2;

public class SmartHomeFacade {
    Light light;
    Fan fan;
    AirConditioner ac;
    TemperatureSensor sensor;

    public SmartHomeFacade(Light light, Fan fan, AirConditioner ac, TemperatureSensor sensor) {
        this.light = light;
        this.fan = fan;
        this.ac = ac;
        this.sensor = sensor;
    }

    public void leaveHome() {
        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }

    public void sleepMode() {
        light.turnOff();
        ac.setTemperature(28);
        fan.lowSpeed();
    }

    public void getCurrentTemperature() {
        double temp = sensor.getTemperatureCelsius();
        System.out.printf("Nhiệt độ hiện tại: %.1f°C%n", temp);
    }
}
