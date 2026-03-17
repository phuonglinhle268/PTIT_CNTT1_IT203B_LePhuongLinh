package PTIT_CNTT1_IT203B_Session08.Bai6;

public class PrintReceipt implements NotificationService{
    public void notifyUser(String message) {
        System.out.println("In hóa đơn: " + message);
    }
}
