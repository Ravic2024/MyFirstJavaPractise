package Interface;

//Point 1: Defines a contract (Payment behavior)
public interface Payment {

    // Point 3: Constant (all payment have max limit)
    public static final double MAX_LIMIT = 100000;

    // Point 2: Abstract Method (must be implemented)
    void pay(double amount);

    // Point 9: Default method (common behavior)
    default void paymentStatus() {
        System.out.println("Payment processed");
    }

    // Point 9: Static method (utility)
    static void paymentGatewayInfo() {
        System.out.println("Using Secure Payment Gateway");
    }
}
