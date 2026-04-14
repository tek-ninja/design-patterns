package Adapter.Client;

import Adapter.Payment;

public class PayPalPaymentAdapter implements Payment {
    PayPalSDK payPalSDK = new PayPalSDK();
    @Override
    public void pay() {
        payPalSDK.payToMerchant();
    }
}
