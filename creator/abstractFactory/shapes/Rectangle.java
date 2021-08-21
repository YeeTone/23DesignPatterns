package creator.abstractFactory.shapes;

import creator.abstractFactory.interface0.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
