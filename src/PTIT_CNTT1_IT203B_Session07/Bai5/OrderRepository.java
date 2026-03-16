package PTIT_CNTT1_IT203B_Session07.Bai5;

import java.util.List;

public interface OrderRepository {
    void save(Order order);
    List<Order> findAll();
}
