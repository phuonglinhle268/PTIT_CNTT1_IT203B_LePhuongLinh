package PTIT_CNTT1_IT203B_Session07.Bai6;

public class PushNotification implements NotificationService{
    public void send(String message) {
        System.out.println("Gửi push notification: " + message);
    }
}
