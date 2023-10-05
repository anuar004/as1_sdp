public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Laptop", 800.0, 1);
        Product product2 = new Product("Headphones", 100.0, 2);

        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        // Choose a payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "Anuar");
        PaymentStrategy paypalPayment = new PayPalPayment("anuardyisenov@gmail.com");

        // Checkout using the selected payment strategy
        cart.checkout(creditCardPayment);
        cart.checkout(paypalPayment);
    }
}
