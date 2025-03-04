package double_p.com.Behavioural_Patterns.Mediator;

public interface ChatMediator {
    public void sendMessage(User sender, String message);
    public void addUser(User user);
}
