package creator.singleton;

public class Hungry {
    private static final Hungry INSTANCE = new Hungry();
    private Hungry(){

    }

    public static Hungry getInstance() {
        return INSTANCE;
    }
}
