package ShoppingCart;

public class Product {
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    private String name;
    private double price;

    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

}
