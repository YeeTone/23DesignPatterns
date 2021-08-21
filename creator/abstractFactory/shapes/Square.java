package creator.abstractFactory.shapes;

import creator.abstractFactory.interface0.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
