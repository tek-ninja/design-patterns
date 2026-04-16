package Strategy;

public class PaypalPayment implements PaymentStrategy{
    public void pay() {
        System.out.println("Paid via PayPal");
    }
}

