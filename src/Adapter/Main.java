package Adapter;

import Adapter.Client.PayPalPaymentAdapter;

public class Main {
    void main(){
        Payment payment = new PayPalPaymentAdapter();
        payment.pay();
    }
}

