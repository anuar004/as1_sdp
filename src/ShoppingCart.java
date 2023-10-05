import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : cart) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double totalPrice = calculateTotalPrice();
        paymentStrategy.processPayment(totalPrice);
    }
}


