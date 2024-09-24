package customers;
import products.Product;

public class Customer {
    // member variables
    private String name;
    private String email;
    private double balance;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.balance = 0.0;
    }

    public void purchaseProduct(Product product) {};
    public double applyDiscount() {};
}
