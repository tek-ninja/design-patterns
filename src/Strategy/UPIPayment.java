package Strategy;

public class UPIPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Paid via UPI");
    }
}
