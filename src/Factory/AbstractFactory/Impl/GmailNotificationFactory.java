package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.NotificationFactory;
import Factory.AbstractFactory.SMSNotification;
import Factory.AbstractFactory.EmailNotification;

public class GmailNotificationFactory implements NotificationFactory {

    @Override
    public EmailNotification createEmail() {
        return new GmailNotification();
    }

    @Override
    public SMSNotification createSMS() {
        return new GmailSMS();
    }
}
