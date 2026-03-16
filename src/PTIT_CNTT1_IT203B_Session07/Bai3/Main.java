package PTIT_CNTT1_IT203B_Session07.Bai3;

public class Main {
    public static void main(String[] args) {

        System.out.println("COD");
        PaymentProcessor processor1 = new PaymentProcessor(new CODPayment());
        processor1.process(500000);

        System.out.println();

        System.out.println("Thẻ tín dụng");
        PaymentProcessor processor2 = new PaymentProcessor(new CreditCardPayment());
        processor2.process(1000000);

        System.out.println();

        System.out.println("Ví MoMo");
        PaymentProcessor processor3 = new PaymentProcessor(new MomoPayment());
        processor3.process(750000);

        System.out.println();

        System.out.println("Kiểm tra LSP");

        PaymentMethod payment = new CreditCardPayment();
        PaymentProcessor processor4 = new PaymentProcessor(payment);
        processor4.process(1000000);

        // Thay implementation
        payment = new MomoPayment();
        processor4 = new PaymentProcessor(payment);
        processor4.process(1000000);
    }
}
