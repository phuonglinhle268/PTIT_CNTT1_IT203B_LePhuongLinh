package PTIT_CNTT1_IT203B_Session08.Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.attach(fan);
        sensor.attach(ac);
        Command sleepMode = new SleepModeCommand(light, fan, ac);

        while (true) {
            System.out.println("\n1. Kích hoạt chế độ ngủ");
            System.out.println("2. Thay đổi nhiệt độ (xem trạng thái)");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sleepMode.execute();
                    break;

                case 2:
                    System.out.print("Nhập nhiệt độ: ");
                    int temp = sc.nextInt();
                    sensor.setTemperature(temp);
                    break;

                case 3:
                    return;
            }
        }
    }
}
