package ThucHanh_session05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) throws InvalidProductException {
        boolean stillProduct = products.stream()
                .anyMatch(product -> product.getId() == p.getId());
        if (stillProduct) {
            throw new InvalidProductException("ID đã tồn tại");
        }
        products.add(p);
    }

    public void displayProduct() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm");
            return;
        }
        products.forEach(System.out::println);
    }
    public void updateQuantity(int id, int newQuantity) throws InvalidProductException {
        Optional<Product> product = products.stream().filter(p -> p.getId() == id).findFirst();

        if (product.isPresent()) {
            product.get().setQuantity(newQuantity);
        } else {
            throw new InvalidProductException("Không tìm thấy sản phẩm");
        }
    }
    public void deleteProduct() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm");
            return;
        }
        products.removeIf(p -> p.getQuantity() == 0);
    }
}
