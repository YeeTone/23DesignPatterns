package structure.adapter.adapter;

import structure.adapter.typeA.TypeAIn;
import structure.adapter.typeA.TypeAOut;
import structure.adapter.typeC.TypeCIn;
import structure.adapter.typeC.TypeCOut;

public class C2AAdapter extends TypeAOut implements Adapter,TypeCIn {

    @Override
    public void chargeByTypeC() {
        this.chargeByTypeA();
    }
}
