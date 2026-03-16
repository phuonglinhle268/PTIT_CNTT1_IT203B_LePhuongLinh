package PTIT_CNTT1_IT203B_Session07.Bai6;

public class POSFactory implements SalesChannelFactory{
    public DiscountStrategy createDiscount() {
        return new StoreDiscount();
    }
    public PaymentMethod createPayment() {
        return new POSPayment();
    }
    public NotificationService createNotification() {
        return new PrintInvoiceNotification();
    }
}
