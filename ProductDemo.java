class Product {
    // Private attributes (Encapsulation)
    private int id;
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product(101, "Laptop", 750.50);
        Product product2 = new Product(102, "Smartphone", 499.99);

        // Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
