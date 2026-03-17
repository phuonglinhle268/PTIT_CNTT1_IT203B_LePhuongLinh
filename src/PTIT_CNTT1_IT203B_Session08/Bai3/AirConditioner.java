package PTIT_CNTT1_IT203B_Session08.Bai3;

public class AirConditioner {
    int temperature = 25;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Điều hòa: Nhiệt độ = " + temp);
    }

    public int getTemperature() {
        return temperature;
    }
}
