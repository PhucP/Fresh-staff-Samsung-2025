package double_p.com.Behavioural_Patterns.Mediator;

public class User {
    protected ChatMediator chatRoom;
    private String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatRoom = chatMediator;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sendMessage(String message){
        System.out.println(name + " send message: " + message);
        chatRoom.sendMessage(this, message);
    }

    public void receiveMessage(String message){
        System.out.println(name + " receive message:  " + message);
    }
}
