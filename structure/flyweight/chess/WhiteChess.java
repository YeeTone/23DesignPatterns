package structure.flyweight.chess;

import structure.flyweight.point.Point;

public class WhiteChess extends Chess{
    @Override
    public void putDisplay(Point p) {
        System.out.printf("白色棋子在(%d,%d)的位置被放置！%n",p.getX(),p.getY());
    }
}
