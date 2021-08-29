package structure.flyweight.factory;

import structure.flyweight.chess.BlackChess;
import structure.flyweight.chess.Chess;
import structure.flyweight.chess.WhiteChess;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ChessFactory {
    private final Map<String,Chess> stringChessMap = new HashMap<>();

    public Chess getChess(String color){
        if(stringChessMap.containsKey(color.toUpperCase(Locale.ROOT))){
            return stringChessMap.get(color.toUpperCase(Locale.ROOT));
        }else{
            switch (color.toUpperCase(Locale.ROOT)){
                case "BLACK":{
                    this.stringChessMap.put("BLACK",new BlackChess());
                    break;
                }

                case "WHITE":{
                    this.stringChessMap.put("WHITE",new WhiteChess());
                    break;
                }

                default:{
                    return null;
                }
            }

            return stringChessMap.get(color.toUpperCase(Locale.ROOT));
        }
    }
}
