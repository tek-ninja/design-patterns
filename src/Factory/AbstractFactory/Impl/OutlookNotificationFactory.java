package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.EmailNotification;
import Factory.AbstractFactory.NotificationFactory;
import Factory.AbstractFactory.SMSNotification;

public class OutlookNotificationFactory implements NotificationFactory {
    @Override
    public EmailNotification createEmail() {
        return new OutlookNotification();
    }

    @Override
    public SMSNotification createSMS() {
        return new OutlookSMS();
    }
}
