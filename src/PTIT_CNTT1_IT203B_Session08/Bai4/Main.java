package PTIT_CNTT1_IT203B_Session08.Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TemperatureSensor sensor = new TemperatureSensor();
        Fan fan = new Fan();
        Humidifier humidifier = new Humidifier();

        while (true) {
            System.out.println("\n1. Đăng ký thiết bị theo dõi nhiệt độ");
            System.out.println("2. Thay đổi nhiệt độ (xem phản ứng)");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sensor.attach(fan);
                    System.out.println("Quạt: Đã đăng ký nhận thông báo");
                    sensor.attach(humidifier);
                    System.out.println("Máy tạo ẩm: Đã đăng ký");
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
