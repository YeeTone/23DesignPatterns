package behavior.responsibilityChain.logger;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("ConsoleLogger::writingMessage: "+message);
    }
}
