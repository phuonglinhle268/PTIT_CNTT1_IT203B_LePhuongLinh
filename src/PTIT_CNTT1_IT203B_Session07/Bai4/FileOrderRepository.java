package PTIT_CNTT1_IT203B_Session07.Bai4;

import java.util.ArrayList;
import java.util.List;

public class FileOrderRepository implements OrderRepository{
    List<Order> orders = new ArrayList<>();

    @Override
    public void save(Order order) {
        orders.add(order);
        System.out.println("Lưu đơn hàng vào file: " + order.getId());
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }
}
