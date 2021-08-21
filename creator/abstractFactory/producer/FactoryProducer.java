package creator.abstractFactory.producer;

import creator.abstractFactory.abstractFactory.AbstractFactory;
import creator.abstractFactory.concreteFactory.ColorFactory;
import creator.abstractFactory.concreteFactory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice==null){
            return null;
        }

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
