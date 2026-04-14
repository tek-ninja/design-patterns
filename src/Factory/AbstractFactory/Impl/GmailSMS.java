package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.SMSNotification;

public class GmailSMS implements SMSNotification {
    @Override
    public void sendSMS() {
        System.out.println("Received GmailSMS Notification");
    }
}
