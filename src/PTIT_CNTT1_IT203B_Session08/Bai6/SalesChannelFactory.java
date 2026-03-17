package PTIT_CNTT1_IT203B_Session08.Bai6;

abstract class SalesChannelFactory {
    abstract DiscountStrategy createDiscountStrategy();
    abstract PaymentMethod createPaymentMethod();
    abstract NotificationService createNotificationService();
}
