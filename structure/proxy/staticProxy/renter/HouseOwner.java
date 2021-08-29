package structure.proxy.staticProxy.renter;

public class HouseOwner implements Renter{
    @Override
    public void rent() {
        System.out.println("房子的主人将房子出租出去了！");
    }
}
