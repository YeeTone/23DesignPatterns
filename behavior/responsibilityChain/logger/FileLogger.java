package behavior.responsibilityChain.logger;

public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        super(level);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("FileLogger::writingMessage: "+message);
    }
}
