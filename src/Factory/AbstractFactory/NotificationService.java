package Factory.AbstractFactory;

public class NotificationService {
    private EmailNotification email;
    private SMSNotification sms;

    public NotificationService(NotificationFactory factory) {
        this.email = factory.createEmail();
        this.sms = factory.createSMS();
    }

    public void sendAll() {
        email.sendEmail();
        sms.sendSMS();
    }
}
