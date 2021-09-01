package behavior.template.game;

public class BigGame extends Game{

    public BigGame(String name) {
        super(name);
    }

    @Override
    public void gainLifeScore() {
        System.out.println("玩家在BigGame"+this.name+"中得到了100分的生命值！");
    }

    @Override
    public void loseLifeScore() {
        System.out.println("玩家在BigGame"+this.name+"中失去了100分的生命值！");

    }
}
