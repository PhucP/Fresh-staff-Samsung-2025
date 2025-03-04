package double_p.com.Behavioural_Patterns.Chain_Of_Responsibility;

public abstract class Logger {
    protected Logger nextLogger;
    private boolean canHandle = true;

    public void logMessage(String message) {
        if(canHandle){
            canHandle = false;
            write(message);
        } else {
            if(nextLogger != null) {
                nextLogger.logMessage(message);
            } else System.out.println("all log messages are busy");
        }
    }

    protected abstract void write(String message);
}

