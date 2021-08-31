package behavior.mediator.mediator;

import behavior.mediator.colleage.Colleague;

import java.util.ArrayList;
import java.util.List;

public class RenRenMediator implements Mediator{
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
            System.out.println("用户在人人车二手车直卖网注册了！");
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague coll:colleagues){
            if(!coll.equals(colleague)){
                coll.receive();
            }
        }
    }
}
