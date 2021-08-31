package behavior.mediator.colleage;

import behavior.mediator.mediator.Mediator;

public abstract class Colleague {
    private final String name;
    protected Mediator mediator;

    public Colleague(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();

    @Override
    public String toString() {
        return "Colleague{" +
                "name='" + name + '\'' +
                '}';
    }
}
