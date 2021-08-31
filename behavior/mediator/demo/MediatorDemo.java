package behavior.mediator.demo;

import behavior.mediator.colleage.BuyerColleague;
import behavior.mediator.colleage.Colleague;
import behavior.mediator.colleage.SellerColleague;
import behavior.mediator.mediator.GuaziMediator;
import behavior.mediator.mediator.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new GuaziMediator();
        Colleague buyerColleague1 = new BuyerColleague("Buyer");
        Colleague sellerColleague1 = new SellerColleague("Seller");

        mediator.register(buyerColleague1);
        mediator.register(sellerColleague1);

        buyerColleague1.send();
        sellerColleague1.send();
    }
}
