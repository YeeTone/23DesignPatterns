package creator.prototype.shapes;

import creator.prototype.shapes.Shape;

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
