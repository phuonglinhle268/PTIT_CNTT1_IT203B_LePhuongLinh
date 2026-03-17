package PTIT_CNTT1_IT203B_Session08.Bai6;

public class OrderService {
    DiscountStrategy discount;
    PaymentMethod payment;
    NotificationService notification;

    public OrderService(SalesChannelFactory factory) {
        this.discount = factory.createDiscountStrategy();
        this.payment = factory.createPaymentMethod();
        this.notification = factory.createNotificationService();
    }

    public void processOrder(double price, int quantity) {
        double total = price * quantity;
        double finalAmount = discount.applyDiscount(total);
        payment.pay(finalAmount);
        notification.notifyUser("Đơn hàng thành công");
    }
}
