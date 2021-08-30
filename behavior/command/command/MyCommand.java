package behavior.command.command;

import behavior.command.receiver.Receiver;

public class MyCommand implements Command{
    private final Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.received();
    }
}
