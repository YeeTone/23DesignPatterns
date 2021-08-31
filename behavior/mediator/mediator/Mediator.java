package behavior.mediator.mediator;

import behavior.mediator.colleage.Colleague;

public interface Mediator {
    void register(Colleague colleague);
    void relay(Colleague colleague);

}
