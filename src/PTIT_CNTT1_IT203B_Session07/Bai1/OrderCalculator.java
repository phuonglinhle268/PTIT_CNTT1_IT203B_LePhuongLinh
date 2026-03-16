package PTIT_CNTT1_IT203B_Session07.Bai1;

public class OrderCalculator {
    public  double calculateTotal(Order order){
        double total = 0;
        for (OrderItem item : order.items){
            total += item.product.price * item.quantity;
        }
        return total;
    }
}
