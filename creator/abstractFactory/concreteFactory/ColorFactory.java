package creator.abstractFactory.concreteFactory;

import creator.abstractFactory.abstractFactory.AbstractFactory;
import creator.abstractFactory.colors.Blue;
import creator.abstractFactory.colors.Green;
import creator.abstractFactory.colors.Red;
import creator.abstractFactory.interface0.Color;
import creator.abstractFactory.interface0.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color==null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
