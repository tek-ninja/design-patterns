package Strategy;

public class CreditCardPayment implements  PaymentStrategy{
    public void pay() {
        System.out.println("Paid via Credit Card");
    }
}
