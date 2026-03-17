package PTIT_CNTT1_IT203B_Session08.Bai6;

public class MobileAppFactory extends SalesChannelFactory{
    DiscountStrategy createDiscountStrategy() {
        return new FirstTimeDiscount();
    }

    PaymentMethod createPaymentMethod() {
        return new MomoPayment();
    }

    NotificationService createNotificationService() {
        return new PushNotification();
    }
}
