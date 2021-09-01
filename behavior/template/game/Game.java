package behavior.template.game;

public abstract class Game{
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    public void startEngine(){
        System.out.println("游戏引擎启动中！");
    }

    public final void game(){
        startEngine();
        gainLifeScore();
        loseLifeScore();
        closeEngine();
    }

    public abstract void gainLifeScore();

    public abstract void loseLifeScore();

    public void closeEngine(){
        System.out.println("关闭游戏引擎！");
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                '}';
    }
}
