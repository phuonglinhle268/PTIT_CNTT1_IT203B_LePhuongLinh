package PTIT_CNTT1_IT203B_Session07.Bai5;

public class OrderService {
    OrderRepository repository;
    NotificationService notificationService;

    public OrderService(OrderRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order, DiscountStrategy discount, PaymentMethod payment) {
        double total = order.getTotal();
        double finalAmount = discount.applyDiscount(total);
        double discountAmount = total - finalAmount;

        order.setFinalAmount(finalAmount);
        InvoiceGenerator generator = new InvoiceGenerator();
        generator.printInvoice(order, discountAmount, finalAmount);
        payment.pay(finalAmount);

        repository.save(order);
        notificationService.send("Đơn hàng " + order.getId() + " đã được tạo", order.getCustomer().getEmail()
        );
    }
    public double calculateRevenue() {
        return repository.findAll().stream().mapToDouble(Order::getFinalAmount).sum();
    }
}
