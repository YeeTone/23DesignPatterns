package structure.flyweight.demo;

import structure.flyweight.chessboard.Chessboard;
import structure.flyweight.point.Point;

public class FlyweightDemo {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        chessboard.putChess(new Point(1,1));
        chessboard.putChess(new Point(2,3));
        chessboard.putChess(new Point(4,4));
        chessboard.putChess(new Point(3,2));
    }
}
