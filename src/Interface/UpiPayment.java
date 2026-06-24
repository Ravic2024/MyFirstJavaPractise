package Interface;

// Point 7: Another implementation (Multiple classes can implement)
public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount +" using UPI");
    }
}
