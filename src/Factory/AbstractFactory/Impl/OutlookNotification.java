package Factory.AbstractFactory.Impl;


import Factory.AbstractFactory.EmailNotification;

public class OutlookNotification implements EmailNotification {
    @Override
    public void sendEmail() {
        System.out.println("Received Outlook Notification");
    }
}
