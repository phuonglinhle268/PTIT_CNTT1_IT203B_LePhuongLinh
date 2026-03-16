package PTIT_CNTT1_IT203B_Session07.Bai1;

public class OrderRepository {
    public void save(Order order) {
        System.out.println("Đã lưu đơn hàng " + order.orderId);
    }
}
