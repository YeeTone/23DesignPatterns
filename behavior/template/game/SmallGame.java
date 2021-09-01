package behavior.template.game;

public class SmallGame extends Game{

    public SmallGame(String name) {
        super(name);
    }

    @Override
    public void gainLifeScore() {
        System.out.println("玩家在SmallGame"+this.name+"中得到了20分的生命值！");
    }

    @Override
    public void loseLifeScore() {
        System.out.println("玩家在SmallGame"+this.name+"中失去了20分的生命值！");
    }
}
