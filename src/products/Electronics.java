package products;

public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price, "Electronics");
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public double calculateDiscount() {
        if (warrantyPeriod <= 6) {
            return getPrice() * 0.05;
        }
        else if (warrantyPeriod > 6 && warrantyPeriod <= 12) {
            return getPrice() * 0.03;
        }
        else {
            return getPrice() * 0.02;
        }
    };
}
