package Collection.UniqueUsernameSet;

import java.util.HashSet;

public class Register {

    HashSet<String> usernames = new HashSet<>();

    public void registerUser(String name){
        var it = usernames.iterator();

        while (it.hasNext()){
            String username = it.next();
            if (username == name){
                System.out.println(name + " - Already exist." );
                return;
            }
        }

        usernames.add(name);
        System.out.println("Added successfully. Name: " + name);
    }
}
