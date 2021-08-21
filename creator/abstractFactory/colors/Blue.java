package creator.abstractFactory.colors;

import creator.abstractFactory.interface0.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
