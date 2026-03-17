package PTIT_CNTT1_IT203B_Session08.Bai4;

public class Fan implements Observer{
    @Override
    public void update(int temperature) {
        if (temperature < 20) {
            System.out.println("Quạt: Nhiệt độ thấp, tự động tắt");
        } else if (temperature <= 25) {
            System.out.println("Quạt: Nhiệt độ bình thường, chạy tốc độ trung bình");
        } else {
            System.out.println("Quạt: Nhiệt độ cao, chạy tốc độ mạnh");
        }
    }
}
