package PTIT_CNTT1_IT203B_Session08.Bai6;

public class EmailNotification implements NotificationService{
    public void notifyUser(String message) {
        System.out.println("Gửi email: " + message);
    }
}
