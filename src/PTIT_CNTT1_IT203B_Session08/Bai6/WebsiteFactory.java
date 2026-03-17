package PTIT_CNTT1_IT203B_Session08.Bai6;

public class WebsiteFactory extends SalesChannelFactory{
    DiscountStrategy createDiscountStrategy() {
        return new WebsiteDiscount();
    }

    PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }

    NotificationService createNotificationService() {
        return new EmailNotification();
    }
}
