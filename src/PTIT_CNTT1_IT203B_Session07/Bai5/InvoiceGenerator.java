package PTIT_CNTT1_IT203B_Session07.Bai5;

public class InvoiceGenerator {
    public void printInvoice(Order order, double discountAmount, double finalAmount) {

        System.out.println("=== HÓA ĐƠN ===");
        System.out.println("Khách: " + order.getCustomer().getName());

        for (OrderItem item : order.getItems()) {
            System.out.println(
                    item.getProduct().getName() + " - Số lượng: " + item.getQuantity()+" - Đơn giá: " + item.getProduct().getPrice() + " - Thành tiền: " + item.getTotal()
            );
        }
        System.out.println("Tổng tiền: " + order.getTotal());
        System.out.println("Giảm giá: " + discountAmount);
        System.out.println("Cần thanh toán: " + finalAmount);
    }
}
