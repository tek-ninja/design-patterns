package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.SMSNotification;

public class OutlookSMS implements SMSNotification {
    @Override
    public void sendSMS() {
        System.out.println("Received OutlookSMS Notification");
    }
}
