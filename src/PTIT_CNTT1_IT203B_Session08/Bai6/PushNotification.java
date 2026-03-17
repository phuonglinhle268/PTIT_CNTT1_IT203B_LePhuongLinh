package PTIT_CNTT1_IT203B_Session08.Bai6;

public class PushNotification implements NotificationService{
    public void notifyUser(String message) {
        System.out.println("Gửi thông báo: " + message);
    }
}
