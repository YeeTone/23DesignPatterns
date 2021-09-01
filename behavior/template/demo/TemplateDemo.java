package behavior.template.demo;

import behavior.template.game.BigGame;
import behavior.template.game.Game;
import behavior.template.game.SmallGame;

public class TemplateDemo {
    public static void main(String[] args) {
        Game big = new BigGame("Red Alert 2");
        big.game();

        Game small = new SmallGame("Spider Poker");
        small.game();
    }
}
