package Strategy;

public class Client {
    void main(){
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(PaymentType.UPI);
    }
}
