package PTIT_CNTT1_IT203B_Session08.Bai5;

public class Fan implements Observer{
    public void low() {
        System.out.println("Quạt: Chạy tốc độ thấp");
    }

    public void high() {
        System.out.println("Quạt: Nhiệt độ cao, chạy tốc độ mạnh");
    }

    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            high();
        }
    }
}
