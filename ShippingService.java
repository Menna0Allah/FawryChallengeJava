import java.util.List;

public class ShippingService {
    public static void ship(List<ShippableItem> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        for (ShippableItem item : items) {
            System.out.println(item.getName() + "    " + item.getWeight() *1000  + "g");
            totalWeight += item.getWeight();
        }
        System.out.println("Total package weight: " + totalWeight + "kg\n");
    }
}