package double_p.com.Behavioural_Patterns.Chain_Of_Responsibility;

public class FileLogger extends Logger{

    @Override
    protected void write(String message) {
        System.out.println("Logging by file logger");
    }

}
