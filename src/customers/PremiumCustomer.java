package customers;
import customers.Customer;

public class PremiumCustomer extends Customer {
    int membershipPoints;

    public PremiumCustomer(String name, String email) {
        super(name, email);
        this.membershipPoints = 0;
    }

    @Override
    public double applyDiscount() {
        return super.applyDiscount();
    }
}
