package Strategy;

public class PaymentService {
   /* public void pay(String type) {
        if (type.equals("CREDIT_CARD")) {
            System.out.println("Paying via Credit Card");
        } else if (type.equals("UPI")) {
            System.out.println("Paying via UPI");
        } else if (type.equals("PAYPAL")) {
            System.out.println("Paying via PayPal");
        }
    }
    1. ❌ Violates Open/Closed Principle
    2. ❌ Tight Coupling
    3. ❌ Hard to Test & Extend  */


    private PaymentFactory factory;

    public PaymentService(PaymentFactory factory) {
        this.factory = factory;
    }

    public void processPayment(PaymentType paymentType) {
        factory.payment(paymentType).pay();
    }

}
