package creator.prototype.shapes;

import creator.prototype.shapes.Shape;

public class Square extends Shape {

    public Square(){
        super();
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
