package behavior.memento.demo;

import behavior.memento.careTaker.CareTaker;
import behavior.memento.originator.Originator;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #114514");
        //System.out.println(originator);
        originator.setState("State #1919810");
        System.out.println(originator);

        careTaker.addMemento(originator.saveState());

        originator.setState("State #123456");
        careTaker.addMemento(originator.saveState());
        System.out.println(originator);

        System.out.println(careTaker.getMemento(0));
        System.out.println(careTaker.getMemento(1));

        originator.restoreState(careTaker.getMemento(0));
        System.out.println(originator);
    }
}
