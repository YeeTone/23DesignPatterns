package creator.singleton;

public class SynchronizedLazy {
    private static SynchronizedLazy INSTANCE;
    private SynchronizedLazy(){

    }

    public static synchronized SynchronizedLazy getInstance() {
        if(INSTANCE == null){
            INSTANCE = new SynchronizedLazy();
        }
        return INSTANCE;
    }
}
