package PTIT_CNTT1_IT203B_Session08.Bai3;

public class FanOffCommand implements Command{
    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.off();
    }

    public void undo() {
        fan.on();
    }
}
