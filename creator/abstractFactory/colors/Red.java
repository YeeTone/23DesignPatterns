package creator.abstractFactory.colors;

import creator.abstractFactory.interface0.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
