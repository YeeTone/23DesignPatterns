package behavior.responsibilityChain.logger;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("ErrorLogger::writeMessage: "+message);
    }
}
