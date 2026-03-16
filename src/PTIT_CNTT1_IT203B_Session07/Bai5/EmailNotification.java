package PTIT_CNTT1_IT203B_Session07.Bai5;

public class EmailNotification implements NotificationService{
    public void send(String message, String recipient) {
        System.out.println("Đã gửi email xác nhận");
    }

}
