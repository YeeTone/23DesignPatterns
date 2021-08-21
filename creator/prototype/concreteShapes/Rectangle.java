package creator.prototype.concreteShapes;

import creator.prototype.abstract0.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        super();
        this.type = "Rectangle";
    }


    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
