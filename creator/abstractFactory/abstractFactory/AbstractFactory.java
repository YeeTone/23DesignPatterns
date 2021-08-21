package creator.abstractFactory.abstractFactory;

import creator.abstractFactory.interface0.Color;
import creator.abstractFactory.interface0.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
