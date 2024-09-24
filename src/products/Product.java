package products;

public abstract class Product {
    /*
    Product:
            - name: String
            - price: double
            - category: String
            - getPrice()
            - getName()
            - getCategory()
            - calculateDiscount()
     */
    // Member variables
    private String productName;
    private double price;
    private String category;

    public Product(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public abstract double calculateDiscount();
}
