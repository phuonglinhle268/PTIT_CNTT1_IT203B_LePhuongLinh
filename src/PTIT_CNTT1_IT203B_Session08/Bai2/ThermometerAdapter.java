package PTIT_CNTT1_IT203B_Session08.Bai2;

public class ThermometerAdapter implements TemperatureSensor{
    OldThermometer oldThermometer;

    public ThermometerAdapter(OldThermometer oldThermometer) {
        this.oldThermometer = oldThermometer;
    }

    @Override
    public double getTemperatureCelsius() {
        int f = oldThermometer.getTemperatureFahrenheit();
        return (f - 32) * 5.0 / 9;
    }
}
