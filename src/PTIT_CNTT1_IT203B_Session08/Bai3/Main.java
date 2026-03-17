package PTIT_CNTT1_IT203B_Session08.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl();

        while (true) {
            System.out.println("\n1. Gán command cho các nút");
            System.out.println("2. Nhấn nút để thực thi");
            System.out.println("3. Undo lệnh vừa thực hiện");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chọn nút:");
                    int slot = sc.nextInt();

                    System.out.println("1. Bật đèn");
                    System.out.println("2. Tắt đèn");
                    System.out.println("3. Bật quạt");
                    System.out.println("4. Tắt quạt");
                    System.out.println("5. Set điều hòa");
                    System.out.print("Chọn lệnh: ");

                    int cmd = sc.nextInt();

                    switch (cmd) {
                        case 1:
                            remote.setCommand(slot, new LightOnCommand(light));
                            break;
                        case 2:
                            remote.setCommand(slot, new LightOffCommand(light));
                            break;
                        case 3:
                            remote.setCommand(slot, new FanOnCommand(fan));
                            break;
                        case 4:
                            remote.setCommand(slot, new FanOffCommand(fan));
                            break;
                        case 5:
                            System.out.print("Nhập nhiệt độ: ");
                            int temp = sc.nextInt();
                            remote.setCommand(slot, new ACSetTemperatureCommand(ac, temp));
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Nhấn nút: ");
                    int press = sc.nextInt();
                    remote.pressButton(press);
                    break;

                case 3:
                    remote.undo();
                    break;

                case 4:
                    return;
            }
        }
    }
}
