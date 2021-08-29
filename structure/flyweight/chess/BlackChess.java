package structure.flyweight.chess;

import structure.flyweight.point.Point;

public class BlackChess extends Chess{
    @Override
    public void putDisplay(Point p) {
        System.out.printf("黑色棋子在(%d,%d)的地方被放置！%n",p.getX(),p.getY());
    }
}
