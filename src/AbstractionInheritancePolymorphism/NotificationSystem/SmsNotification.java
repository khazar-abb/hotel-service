package AbstractionInheritancePolymorphism.NotificationSystem;

public class SmsNotification extends Notification{

    @Override
    public void send(){
        System.out.println("Sending SMS: message");
    }
}
