package PTIT_CNTT1_IT203B_Session07.Bai6;

public class WebsiteFactory implements SalesChannelFactory{
    public DiscountStrategy createDiscount() {
        return new WebsiteDiscount();
    }
    public PaymentMethod createPayment() {
        return new WebsitePayment();
    }
    public NotificationService createNotification() {
        return new EmailNotification();
    }
}
