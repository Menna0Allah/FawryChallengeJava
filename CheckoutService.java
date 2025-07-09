import java.util.*;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("the basket is empty");
            return;
        }

        double subtotal = 0;
        double shippingFees = 0;
        List<ShippableItem> shippables = new ArrayList<>();

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            if (product.getQuantity() < quantity) {
                System.out.println("the amount of the product not available in the factory: " + product.getName());
                return;
            }
            if (product.isExpired()) {
                System.out.println("the end of the availablity of :" + product.getName());
                return;
            }

            subtotal += product.getPrice() * quantity;

            if (product.isShippable()) {
                double totalWeight = product.getWeight() * quantity;
                shippables.add(new Shippable(product.getName() + " x" + quantity, totalWeight));
                shippingFees += 15;
            }
        }

        double total = subtotal + shippingFees;

        if (customer.getBalance() < total) {
            System.out.println("the amount is not enough");
            return;
        }
        
        if (!shippables.isEmpty()) {
            ShippingService.ship(shippables);
        }
        
        System.out.println("\n** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product p = entry.getKey();
            int q = entry.getValue();
            System.out.println(q + "x " + p.getName() + "    " + (p.getPrice() * q));
            p.decreaseQuantity(q);
        }
        System.out.println("----------------------");
        System.out.println("Subtotal    " + subtotal);
        System.out.println("Shipping    " + shippingFees);
        System.out.println("Amount      " + total);

        customer.deductBalance(total);
        System.out.println("Balance after payment: " + customer.getBalance());

    }
}