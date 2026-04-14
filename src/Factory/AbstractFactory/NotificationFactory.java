package Factory.AbstractFactory;

public interface NotificationFactory {
    EmailNotification createEmail();
    SMSNotification createSMS();
}
