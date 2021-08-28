package structure.decorator.demo;

import structure.decorator.materials.*;

public class DecoratorDemo {
    public static void main(String[] args) {
        Component basicBoard = new WhiteBoard();
        Component painted = new PaintDecorator(basicBoard);
        Component paintWithGlass = new GlassDecorator(painted);

        paintWithGlass.display();

        Component paintWithGlassWithGoldEdge = new GoldEdgeDecorator(paintWithGlass);

        paintWithGlassWithGoldEdge.display();
    }
}
