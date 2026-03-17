package PTIT_CNTT1_IT203B_Session08.Bai3;

public class FanOnCommand implements Command{
    Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.on();
    }

    public void undo() {
        fan.off();
    }
}
