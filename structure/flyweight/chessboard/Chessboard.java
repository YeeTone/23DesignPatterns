package structure.flyweight.chessboard;

import structure.flyweight.factory.ChessFactory;
import structure.flyweight.point.Point;

public class Chessboard {
    private final ChessFactory chessFactory = new ChessFactory();
    private static final int WHITE = 0;
    private static final int BLACK = 1;
    private int current = 0;

    public Chessboard(){
        System.out.println("这是一个黑白棋的棋盘！");
    }

    public void putChess(Point p){
        switch (current){
            case WHITE:{
                chessFactory.getChess("WHITE").putDisplay(p);
                current = BLACK;
                break;
            }

            case BLACK:{
                chessFactory.getChess("BLACK").putDisplay(p);
                current = WHITE;
                break;
            }
        }
    }
}
