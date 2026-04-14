package Factory;

import java.util.Map;
import java.util.function.Supplier;

class NotificationFactory {
//    public static Notification create(NotificationType type) {
//        switch (type) {
//            case NotificationType.EMAIL:
//                return new EmailNotification();
//            case NotificationType.SMS:
//                return new SMSNotification();
//            default:
//                throw new IllegalArgumentException("Invalid type");
//        }
//    }
   static Map<NotificationType, Supplier<Notification>> registry = Map.of(
            NotificationType.EMAIL, EmailNotification::new,
            NotificationType.SMS, SMSNotification::new
    );

    public static Notification create(NotificationType type) {
        return registry.get(type).get();
    }

}
