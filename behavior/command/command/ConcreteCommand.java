package behavior.command.command;

import behavior.command.receiver.Receiver;

public class ConcreteCommand implements Command{
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.received();
    }
}
