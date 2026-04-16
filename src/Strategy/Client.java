package Strategy;

public class Client {
    void main(){
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentService paymentService = new PaymentService(paymentFactory);
        paymentService.processPayment(PaymentType.UPI);
    }
}
