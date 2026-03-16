package PTIT_CNTT1_IT203B_Session07.Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn kênh bán hàng:");
        System.out.println("1. Website");
        System.out.println("2. Mobile App");
        System.out.println("3. Store POS");
        int choice = sc.nextInt();
        SalesChannelFactory factory = null;

        switch (choice) {
            case 1:
                factory = new WebsiteFactory();
                System.out.println("Bạn đã chọn kênh Website");
                break;

            case 2:
                factory = new MobileFactory();
                System.out.println("Bạn đã chọn kênh Mobile App");
                break;

            case 3:
                factory = new POSFactory();
                System.out.println("Bạn đã chọn kênh POS");
                break;
        }

        Product product = new Product("Laptop", 15000000);
        Order order = new Order(product, 1);
        OrderService service = new OrderService(factory);
        service.createOrder(order);
    }
}
