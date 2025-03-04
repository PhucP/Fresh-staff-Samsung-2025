package double_p.com.Behavioural_Patterns.Chain_Of_Responsibility;

public class Test {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();
        
        fileLogger.nextLogger = consoleLogger;

        fileLogger.logMessage("Message 1");
        fileLogger.logMessage("Message 2");
        fileLogger.logMessage("Message 3");


    }
}
