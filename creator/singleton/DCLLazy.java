package creator.singleton;

public class DCLLazy {
    private volatile static DCLLazy singleton;
    private DCLLazy(){

    }

    public static DCLLazy getInstance(){
        if(singleton==null){
            synchronized (DCLLazy.class){
                if(singleton==null){
                    singleton = new DCLLazy();
                }
            }
        }

        return singleton;
    }
}
