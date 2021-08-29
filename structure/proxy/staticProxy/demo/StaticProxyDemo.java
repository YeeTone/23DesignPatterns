package structure.proxy.staticProxy.demo;

import structure.proxy.staticProxy.renter.HouseOwner;
import structure.proxy.staticProxy.renter.HouseProxy;

//代理模式与装饰器模式的区别
public class StaticProxyDemo {
    public static void main(String[] args) {
        HouseOwner owner = new HouseOwner();
        HouseProxy proxy = new HouseProxy(owner);

        proxy.rent();
    }
}
