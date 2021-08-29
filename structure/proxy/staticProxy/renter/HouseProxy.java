package structure.proxy.staticProxy.renter;

public class HouseProxy implements Renter{
    private final HouseOwner owner;

    public HouseProxy(HouseOwner owner){
        this.owner = owner;
    }


    @Override
    public void rent() {
        this.goSeeHouse();
        this.sign();
        this.owner.rent();
        this.getFee();
    }

    public void goSeeHouse(){
        System.out.println("代理方带客户看房子！");
    }

    public void sign(){
        System.out.println("代理方签订合同！");
    }

    public void getFee(){
        System.out.println("代理方收取中介费用！");
    }
}
