package Factory.AbstractFactory.Impl;

import Factory.AbstractFactory.NotificationFactory;
import Factory.AbstractFactory.NotificationService;

public class Client {
    void main(){
        NotificationFactory notificationFactory = new GmailNotificationFactory();
        NotificationService notificationService = new NotificationService(notificationFactory);
        notificationService.sendAll();
    }
}
