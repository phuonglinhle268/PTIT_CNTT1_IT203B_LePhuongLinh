package PTIT_CNTT1_IT203B_Session07.Bai6;

public interface SalesChannelFactory {
    DiscountStrategy createDiscount();
    PaymentMethod createPayment();
    NotificationService createNotification();
}
