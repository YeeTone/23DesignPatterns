package behavior.mediator.colleage;

public class SellerColleague extends Colleague{
    public SellerColleague(String name) {
        super(name);
    }

    @Override
    public void receive() {
        System.out.println("卖方收到了需要产品售卖的请求！");
    }

    @Override
    public void send() {
        System.out.println("卖方将要卖的产品发送了出去！");
        this.mediator.relay(this);
    }
}
