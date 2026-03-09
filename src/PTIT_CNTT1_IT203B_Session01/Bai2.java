package PTIT_CNTT1_IT203B_Session01;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số người dùng: ");
        int totalUser = scanner.nextInt();
        System.out.print("Nhập số nhóm muốn chia: ");
        int group = scanner.nextInt();

        try {
            int userInGroup = totalUser / group;
            System.out.println("Số người 1 nhóm: " + userInGroup + " người");
        }
        catch (ArithmeticException e){
            System.out.println("Không thể chia cho 0");
        }
    }
}
