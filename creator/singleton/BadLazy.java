package creator.singleton;

public class BadLazy {
    private static BadLazy INSTANCE;

    private BadLazy(){

    }

    public static BadLazy getInstance() {
        if(INSTANCE == null){
            INSTANCE = new BadLazy();
        }
        return INSTANCE;
    }
}
