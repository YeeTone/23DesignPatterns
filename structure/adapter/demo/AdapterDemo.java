package structure.adapter.demo;

import structure.adapter.adapter.A2CAdapter;
import structure.adapter.adapter.Adapter;
import structure.adapter.adapter.C2AAdapter;
import structure.adapter.typeA.TypeAIn;
import structure.adapter.typeC.TypeCIn;
import structure.adapter.typeC.TypeCOut;

public class AdapterDemo {
    public static void main(String[] args) {
        TypeAIn aIn = new A2CAdapter();
        aIn.chargeByTypeA();

        TypeCIn cIn = new C2AAdapter();
        cIn.chargeByTypeC();
    }
}
