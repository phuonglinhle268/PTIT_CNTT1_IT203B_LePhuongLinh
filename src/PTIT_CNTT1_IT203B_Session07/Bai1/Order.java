package PTIT_CNTT1_IT203B_Session07.Bai1;

import java.util.*;

public class Order {
    String orderId;
    Customer customer;
    List<OrderItem> items = new ArrayList<>();

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }
}