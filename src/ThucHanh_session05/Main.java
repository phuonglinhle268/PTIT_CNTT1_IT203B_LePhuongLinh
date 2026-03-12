package ThucHanh_session05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService listProduct = new ProductService();

        while (true) {
            System.out.println("===== PRODUCT MANAGEMENT SYSTEM =====");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật số lượng theo ID");
            System.out.println("4. Xóa sản phẩm đã hết hàng");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Nhập id: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Tên sản phẩm: ");
                        String name = sc.nextLine();
                        System.out.print("Giá sản phẩm: ");
                        double price = sc.nextDouble();
                        System.out.print("Số lượng: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Tên danh mục: ");
                        String category = sc.nextLine();

                        Product p = new Product(id, name, price, quantity, category);
                        listProduct.addProduct(p);
                        System.out.println("Thêm sản phẩm thành công");
                        break;
                    case 2:
                        System.out.println("Danh sách sản phẩm");
                        listProduct.displayProduct();
                        break;
                    case 3:
                        System.out.print("Nhập ID sản phẩm: ");
                        int updateId = sc.nextInt();
                        System.out.print("Nhập số lượng mới: ");
                        int newQuantity = sc.nextInt();

                        listProduct.updateQuantity(updateId, newQuantity);
                        System.out.println("Cập nhật sản phẩm thành công");
                        break;

                    case 4:
                        listProduct.deleteProduct();
                        break;

                    case 5:
                        System.out.println("Thoát");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            }
            catch (InvalidProductException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}