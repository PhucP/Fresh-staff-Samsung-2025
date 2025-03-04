package double_p.com.Behavioural_Patterns.Mediator;

public class Test {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User alice = new User(chatRoom, "Alice" );
        User bob = new User(chatRoom, "Bob");
        User jinx = new User(chatRoom, "Jinx");

        chatRoom.addUser(jinx);
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);

        alice.sendMessage("Hello Bob!");
        System.out.println("---------------------------------");
        bob.sendMessage("Hi Alice!");
        System.out.println("---------------------------------");
        jinx.sendMessage("I'm Jinx!");
    }
}
