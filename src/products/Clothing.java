package products;

public class Clothing extends Product {
    private String size;

    public Clothing(String productName, double price, String size) {
        super(productName, price, "Clothing");
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double calculateDiscount() {
        return switch (size) {
            case "Extra Small", "Extra Large" -> getPrice() * 0.05;
            case "Small", "Medium" -> getPrice() * 0.03;
            case "Large" -> getPrice() * 0.02;
            default -> getPrice();
        };
    }
}
