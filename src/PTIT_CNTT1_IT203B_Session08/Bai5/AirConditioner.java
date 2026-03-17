package PTIT_CNTT1_IT203B_Session08.Bai5;

public class AirConditioner implements Observer{
    int temperature = 25;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Điều hòa: Nhiệt độ = " + temp);
    }

    @Override
    public void update(int temp) {}
}
