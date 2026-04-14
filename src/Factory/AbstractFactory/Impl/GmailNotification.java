package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.EmailNotification;

public class GmailNotification implements EmailNotification {

    @Override
    public void sendEmail() {
        System.out.println("Received Gmail Notification");
    }
}
