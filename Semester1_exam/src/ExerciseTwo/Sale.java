package ExerciseTwo;

public class Sale implements DiscountRate {
    private double amount;
    private Customer customer;

    public Sale(double amount, Customer customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getTotalAmount() {
        double serviceDiscount = this.getServiceDiscountRate(this.customer.getType());
        double productDiscount = this.getProductDiscountRate(this.customer.getType());
        double productAmount = this.amount * (1.0 - productDiscount);
        return productAmount;
    }

    public double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return 0.2;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.1;
            default:
                return 0.0;
        }
    }

    public double getProductDiscountRate(String type) {
        switch (type) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.1;
            default:
                return 0.0;
        }
    }
}