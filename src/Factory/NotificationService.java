package Factory;

public class NotificationService {
    public void send(NotificationType type) {
        Notification notification = NotificationFactory.create(type);
        notification.send();
    }
}


//class NotificationService {
//    public void send(String type) {
//        if (type.equals("EMAIL")) {
//            EmailNotification email = new EmailNotification();
//            email.send();
//        } else if (type.equals("SMS")) {
//            SMSNotification sms = new SMSNotification();
//            sms.send();
//        } else if (type.equals("PUSH")) {
//            PushNotification push = new PushNotification();
//            push.send();
//        }
//    }
//}

//1. Violation of Open/Closed Principle (OCP)
//2. Tight Coupling
//
//NotificationService knows:
//
//All concrete classes
//How to create them
//
//👉 This class becomes a God class
//
//
//4. Duplication Everywhere
//
//If 5 services need notifications:
//        👉 All will copy the same if-else logic
// type.equals("EMAIL") // typo risk
