public class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean isShippable;
    private double weight;
    private boolean isExpired;

    public Product(String name, double price, int quantity, boolean isPerishable, boolean isShippable, double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isShippable = isShippable;
        this.weight = isShippable ? weight : 0;
        this.isExpired = false;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public boolean isExpired() { return isExpired; }
    public void setExpired(boolean expired) { isExpired = expired; }
    public boolean isShippable() { return isShippable; }
    public double getWeight() { return weight; }
    public void decreaseQuantity(int amount) { this.quantity -= amount; }
}