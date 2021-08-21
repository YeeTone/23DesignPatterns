package creator.abstractFactory.concreteFactory;

import creator.abstractFactory.abstractFactory.AbstractFactory;
import creator.abstractFactory.interface0.Color;
import creator.abstractFactory.interface0.Shape;
import creator.abstractFactory.shapes.Circle;
import creator.abstractFactory.shapes.Rectangle;
import creator.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape==null){
            return null;
        }

        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
