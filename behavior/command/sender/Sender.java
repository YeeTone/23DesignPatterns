package behavior.command.sender;

import behavior.command.command.Command;

public class Sender {
    private final String name;

    private final Command command;

    public Sender(String name,Command command){
        this.name = name;
        this.command = command;
    }

    public void send(){
        System.out.println("Sender::send(), name = "+name);
        this.command.execute();
    }
}
