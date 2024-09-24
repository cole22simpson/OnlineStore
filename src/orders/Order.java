package orders;
import products.Product;
import customers.Customer;
import java.util.List;

public class Order {
    /*
    Order:
            - orderID: String
            - products: List<Product>
            - customer: Customer
            - totalAmount: double
            - calculateTotal()
            - addProduct(Product product)
     */

    // Member variables
    private String orderID;
    private List<Product> products;
    private Customer customer;

    public Order(String orderID, List<Product> products, Customer customer) {
        this.orderID = orderID;
        this.products = products;
        this.customer = customer;
    }
}
