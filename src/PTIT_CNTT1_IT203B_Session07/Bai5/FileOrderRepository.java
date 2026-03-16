package PTIT_CNTT1_IT203B_Session07.Bai5;

import java.util.ArrayList;
import java.util.List;

public class FileOrderRepository implements OrderRepository{
    List<Order> orders = new ArrayList<>();

    public void save(Order order) {
        orders.add(order);
        System.out.println("Đã lưu đơn hàng " + order.getId());
    }

    public List<Order> findAll() {
        return orders;
    }
}
