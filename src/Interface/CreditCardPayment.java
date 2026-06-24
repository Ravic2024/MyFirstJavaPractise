package Interface;

// Point 5: Implements interface
public class CreditCardPayment implements Payment {

    // Point 6: Must implement abstract method
    @Override
    public void pay(double amount) {

        // Point 3: Using constant
        if(amount > MAX_LIMIT) {
            System.out.println("Amount exceeds limit");
        } else {
            System.out.println("Paid "+ amount +" using Credit Card");
        }

    }
}
