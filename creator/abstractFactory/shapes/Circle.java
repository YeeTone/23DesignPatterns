package creator.abstractFactory.shapes;

import creator.abstractFactory.interface0.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
