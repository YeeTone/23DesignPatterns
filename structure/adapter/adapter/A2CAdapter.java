package structure.adapter.adapter;

import structure.adapter.typeA.TypeAIn;
import structure.adapter.typeC.TypeCOut;

public class A2CAdapter extends TypeCOut implements Adapter,TypeAIn {
    @Override
    public void chargeByTypeA() {
        this.chargeByTypeC();
    }
}
