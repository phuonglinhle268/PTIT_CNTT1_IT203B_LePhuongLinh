package PTIT_CNTT1_IT203B_Session01;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập năm sinh: ");
            String year = scanner.nextLine();

            int birthYear =Integer.parseInt(year);
            int age = 2026 - birthYear;
            System.out.println("Tuổi: " + age);
        }
        catch (NumberFormatException e){
            System.out.println("Lỗi: Năm sinh phải là số");
        }
        finally {
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}
