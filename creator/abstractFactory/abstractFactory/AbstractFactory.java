package creator.abstractFactory.abstractFactory;

import creator.abstractFactory.colors.Color;
import creator.abstractFactory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
