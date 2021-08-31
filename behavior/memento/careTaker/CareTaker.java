package behavior.memento.careTaker;

import behavior.memento.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        } else {
            return null;
        }
    }
}
