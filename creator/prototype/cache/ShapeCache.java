package creator.prototype.cache;


import creator.prototype.abstract0.Shape;
import creator.prototype.concreteShapes.Circle;
import creator.prototype.concreteShapes.Rectangle;
import creator.prototype.concreteShapes.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(),c);

        Square s = new Square();
        s.setId("2");
        shapeMap.put(s.getId(),s);

        Rectangle r = new Rectangle();
        r.setId("3");
        shapeMap.put(r.getId(),r);
    }
}
