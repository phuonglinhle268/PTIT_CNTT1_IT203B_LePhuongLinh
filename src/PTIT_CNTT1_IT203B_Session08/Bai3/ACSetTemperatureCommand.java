package PTIT_CNTT1_IT203B_Session08.Bai3;

public class ACSetTemperatureCommand implements Command{
    AirConditioner ac;
    int newTemp;
    int prevTemp;

    public ACSetTemperatureCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    public void execute() {
        prevTemp = ac.getTemperature();
        ac.setTemperature(newTemp);
    }

    public void undo() {
        ac.setTemperature(prevTemp);
        System.out.println("Undo: Điều hòa: Nhiệt độ = " + prevTemp);
    }
}
