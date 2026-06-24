package Interface;

public class Main {

    // Point 12: Loose Coupling
    // Point 13: Polymorphism

    static void main() {

        Payment payment = new CreditCardPayment();
        payment.pay(5000);
        payment.paymentStatus();

        Payment payment1 = new UpiPayment();
        payment1.pay(2000);
        payment1.paymentStatus();

        Payment.paymentGatewayInfo();

    }




}
