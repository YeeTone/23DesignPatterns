package creator.singleton;

public enum EnumSingle {
    INSTANCE;

    public static EnumSingle getInstance(){
        return INSTANCE;
    }
}
