public class Main {
    public static void main(String[] args) {
        /*
        Class Structure:
        Product:
            - name: String
            - price: double
            - category: String
            - getPrice()
            - getName()
            - getCategory()
            - calculateDiscount()
        Electronics
            - warrantyPeriod: int
            - calculateDiscount()
        Clothing:
            - size: String
            - calculateDiscount()
        Customer:
            - name: String
            - email: String
            - balance: double
            - purchaseProduct(Product product)
            - applyDiscount()
        Premium Customer:
        - membershipPoints: int
        - applyDiscount()
        Order:
            - orderID: String
            - products: List<Product>
            - customer: Customer
            - totalAmount: double
            - calculateTotal()
            - addProduct(Product product)
        Discountable: (Interface)
            - applyDiscount()
        StoreUtility:
            - calculateShippingCost(Product product)
            - calculateShippingCost(Product product, int distance)
         */
    }
}