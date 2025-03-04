package double_p.com.Behavioural_Patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(User sender, String message) {
        for(User user : users){
            if(!user.getName().equalsIgnoreCase(sender.getName())){
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

}
