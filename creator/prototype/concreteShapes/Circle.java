package creator.prototype.concreteShapes;

import creator.prototype.abstract0.Shape;

public class Circle extends Shape {

    public Circle(){
        this.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
