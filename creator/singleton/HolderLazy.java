package creator.singleton;

public class HolderLazy {
    private static class LazyHolder{
        private static final HolderLazy INSTANCE = new HolderLazy();
    }

    private HolderLazy(){

    }

    public static HolderLazy getInstance() {
        return LazyHolder.INSTANCE;
    }
}
