package AbstractionInheritancePolymorphism.NotificationSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Notification>notifications = new ArrayList<>();

        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());

        for (Notification note : notifications){
            note.send();
        }
    }
}