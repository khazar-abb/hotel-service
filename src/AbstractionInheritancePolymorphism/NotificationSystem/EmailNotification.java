package AbstractionInheritancePolymorphism.NotificationSystem;

public class EmailNotification extends Notification{

    @Override
    public void send(){
        System.out.println("Sending EMAIL: message");
    }
}
