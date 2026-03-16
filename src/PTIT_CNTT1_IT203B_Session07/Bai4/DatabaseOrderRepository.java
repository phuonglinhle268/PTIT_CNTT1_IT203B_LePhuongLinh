package PTIT_CNTT1_IT203B_Session07.Bai4;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOrderRepository implements  OrderRepository{
    List<Order> orders = new ArrayList<>();

    @Override
    public void save(Order order) {
        orders.add(order);
        System.out.println("Lưu đơn hàng vào database: " + order.getId());
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }
}
