package creator.factory.factory;

import creator.factory.shapes.Shape;
import creator.factory.shapes.Circle;
import creator.factory.shapes.Rectangle;
import creator.factory.shapes.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
