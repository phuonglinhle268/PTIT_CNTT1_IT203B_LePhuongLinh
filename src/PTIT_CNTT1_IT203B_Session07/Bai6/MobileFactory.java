package PTIT_CNTT1_IT203B_Session07.Bai6;

public class MobileFactory implements SalesChannelFactory{
    public DiscountStrategy createDiscount() {
        return new MobileDiscount();
    }
    public PaymentMethod createPayment() {
        return new MobilePayment();
    }
    public NotificationService createNotification() {
        return new PushNotification();
    }
}
