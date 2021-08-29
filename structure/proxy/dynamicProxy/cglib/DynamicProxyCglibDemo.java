package structure.proxy.dynamicProxy.cglib;

public class DynamicProxyCglibDemo {
    public static void main(String[] args){
        GamePlayer gamePlayer = new GamePlayer();
        CGLIBProxy cglibProxy = new CGLIBProxy();
        GamePlayer playerProxy = (GamePlayer) cglibProxy.getInstance(gamePlayer);

        playerProxy.redAlert2();
        playerProxy.cf();
        playerProxy.csgo();
        playerProxy.genshin();
    }
}
