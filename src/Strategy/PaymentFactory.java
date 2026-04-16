package Strategy;



import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {
    private static Map<PaymentType, Supplier<PaymentStrategy>> registry =
            Map.of(PaymentType.CREDIT,CreditCardPayment::new,
            PaymentType.PAYPAL,PaypalPayment::new,
            PaymentType.UPI,UPIPayment::new);
    public PaymentStrategy payment(PaymentType paymentType){
        return registry.get(paymentType).get();
    }
}
