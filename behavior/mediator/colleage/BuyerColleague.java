package behavior.mediator.colleage;

public class BuyerColleague extends Colleague{
    public BuyerColleague(String name) {
        super(name);
    }

    @Override
    public void receive() {
        System.out.println("买家收到了产品！");
    }

    @Override
    public void send() {
        System.out.println("买家发出购买产品的请求");
        this.mediator.relay(this);
    }
}
