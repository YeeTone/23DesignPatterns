package behavior.command.receiver;

public class Receiver {
    private final String name;

    public Receiver(String name){
        this.name = name;
    }

    public void received(){
        System.out.println("Receiver::received(), name = "+name);
    }
}
