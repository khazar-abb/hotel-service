package AbstractionInheritancePolymorphism.NotificationSystem;

public class PushNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Sending PUSH notification: message");
    }
}
