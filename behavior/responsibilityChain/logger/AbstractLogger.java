package behavior.responsibilityChain.logger;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public AbstractLogger(int level){
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            writeMessage(message);
        }

        if(this.nextLogger != null){
            this.nextLogger.logMessage(level, message);
        }
    }

    public abstract void writeMessage(String message);
}
