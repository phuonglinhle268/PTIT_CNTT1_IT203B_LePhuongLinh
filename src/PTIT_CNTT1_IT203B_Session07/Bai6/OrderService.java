package PTIT_CNTT1_IT203B_Session07.Bai6;

public class OrderService {
    SalesChannelFactory factory;

    public OrderService(SalesChannelFactory factory) {
        this.factory = factory;
    }

    public void createOrder(Order order) {
        DiscountStrategy discount = factory.createDiscount();
        PaymentMethod payment = factory.createPayment();
        NotificationService notification = factory.createNotification();

        double total = order.getTotal();
        double finalAmount = discount.applyDiscount(total);
        System.out.println("Sản phẩm: " + order.getProduct().getName());
        payment.pay(finalAmount);
        notification.send("Đơn hàng thành công");
    }

}
