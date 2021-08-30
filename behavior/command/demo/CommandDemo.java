package behavior.command.demo;

import behavior.command.command.Command;
import behavior.command.command.MyCommand;
import behavior.command.sender.Sender;
import behavior.command.receiver.Receiver;

public class CommandDemo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver("YeeTone");
        Command command = new MyCommand(receiver);
        Sender sender = new Sender("Wang",command);

        sender.send();
    }
}
