package creator.abstractFactory.colors;

import creator.abstractFactory.interface0.Color;

public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
