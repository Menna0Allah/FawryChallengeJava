public class Shippable implements ShippableItem {
    private String name;
    private double weight;

    public Shippable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
}