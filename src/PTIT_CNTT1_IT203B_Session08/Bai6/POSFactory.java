package PTIT_CNTT1_IT203B_Session08.Bai6;

public class POSFactory extends SalesChannelFactory{
    DiscountStrategy createDiscountStrategy() {
        return new MemberDiscount();
    }

    PaymentMethod createPaymentMethod() {
        return new CODPayment();
    }

    NotificationService createNotificationService() {
        return new PrintReceipt();
    }
}
