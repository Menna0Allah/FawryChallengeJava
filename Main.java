public class Main {
    public static void main(String[] args) {
        Product cheese = new Product("Cheese", 100, 10, true, true, 0.2);
        Product biscuits = new Product("Biscuits", 150, 5, true, true, 0.7);
        Customer customer = new Customer("Menna", 1000);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);

        CheckoutService.checkout(customer, cart);
    }
}