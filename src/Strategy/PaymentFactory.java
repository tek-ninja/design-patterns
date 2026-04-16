package Strategy;



import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {

    private static final Map<PaymentType, Supplier<PaymentStrategy>> registry =
            Map.of(
                    PaymentType.CREDIT, CreditCardPayment::new,
                    PaymentType.PAYPAL, PaypalPayment::new,
                    PaymentType.UPI, UPIPayment::new
            );

    public static PaymentStrategy getStrategy(PaymentType paymentType) {
        Supplier<PaymentStrategy> supplier = registry.get(paymentType);

        if (supplier == null) {
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }

        return supplier.get();
    }
}
