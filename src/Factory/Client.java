package Factory;

public class Client {
    void main(){
        NotificationService notificationService = new NotificationService();
        notificationService.send(NotificationType.EMAIL);
    }
}
