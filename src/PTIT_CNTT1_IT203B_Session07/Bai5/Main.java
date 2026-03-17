package PTIT_CNTT1_IT203B_Session07.Bai5;
import java.util.*;

public class Main {
    static List<Product> products = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static Map<String, PaymentMethod> paymentMethods = new HashMap<>();
    static Map<String, DiscountStrategy> discounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderRepository repo = new FileOrderRepository();
        NotificationService notify = new EmailNotification();
        OrderService service = new OrderService(repo, notify);

        paymentMethods.put("COD", new CODPayment());
        paymentMethods.put("Card", new CreditCardPayment());
        paymentMethods.put("Momo", new MomoPayment());

        discounts.put("10%", new PercentageDiscount(10));

        while (true) {
            System.out.println("\n1. Thêm sản phẩm");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Tạo đơn hàng");
            System.out.println("4. Xem đơn hàng");
            System.out.println("5. Tính doanh thu");
            System.out.println("6. Thêm thanh toán mới");
            System.out.println("7. Thêm giảm giá mới");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Product p = new Product("SP01","Laptop",15000000,"Điện tử");
                    products.add(p);
                    System.out.println("Đã thêm sản phẩm SP01");
                    break;

                case 2:
                    Customer c = new Customer("Nguyễn Văn A","a@example.com","0123456789");
                    customers.add(c);
                    System.out.println("Đã thêm khách hàng");
                    break;

                case 3:
                    Customer customer = customers.get(0);
                    Order order = new Order("ORD001", customer);
                    order.addItem(new OrderItem(products.get(0),1));

                    DiscountStrategy discount = discounts.get("10%");
                    PaymentMethod payment = paymentMethods.get("Card");

                    service.processOrder(order,discount,payment);
                    break;

                case 4:
                    for (Order o : repo.findAll()) {
                        System.out.println(o.getId() + " - "+ o.getCustomer().getName() + " - "+ o.getFinalAmount());
                    }
                    break;

                case 5:
                    System.out.println("Tổng doanh thu: " + service.calculateRevenue());
                    break;

                case 6:
                    System.out.println("Nhập tên thanh toán mới:");
                    String name = sc.nextLine();
                    paymentMethods.put(name, amount -> System.out.println("Thanh toán " + name + ": " + amount));

                    System.out.println("Đã thêm phương thức thanh toán " + name);
                    break;

                case 7:
                    System.out.println("Nhập % giảm:");
                    double percent = sc.nextDouble();
                    discounts.put("VIP", new PercentageDiscount(percent));
                    System.out.println("Đã thêm chiến lược giảm giá VIP");
                    break;

                case 0:
                    return;
            }
        }
    }
}
