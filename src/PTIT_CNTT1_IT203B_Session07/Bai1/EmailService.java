package PTIT_CNTT1_IT203B_Session07.Bai1;

public class EmailService {
    public void sendConfirmation(String email, String orderId) {
        System.out.println("Đã gửi email đến " + email + ": Đơn hàng " + orderId + " đã được tạo");
    }
}
