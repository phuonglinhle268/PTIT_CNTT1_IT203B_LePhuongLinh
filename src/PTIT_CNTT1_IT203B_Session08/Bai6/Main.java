package PTIT_CNTT1_IT203B_Session08.Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Chọn kênh: ");
        System.out.println("1. Website");
        System.out.println("2. Mobile App");
        System.out.println("3. POS");
        int choice = sc.nextInt();

        SalesChannelFactory factory = null;

        switch (choice) {
            case 1:
                factory = new WebsiteFactory();
                System.out.println("Bạn đã chọn kênh Website");
                break;
            case 2:
                factory = new MobileAppFactory();
                System.out.println("Bạn đã chọn kênh Mobile App");
                break;
            case 3:
                factory = new POSFactory();
                System.out.println("Bạn đã chọn kênh POS");
                break;
        }

        OrderService service = new OrderService(factory);

        System.out.print("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int productAmount = sc.nextInt();

        service.processOrder(price, productAmount);
    }
}
