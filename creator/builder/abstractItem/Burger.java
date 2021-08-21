package creator.builder.abstractItem;

import creator.builder.interface0.Item;
import creator.builder.interface0.Packing;
import creator.builder.packs.Wrapper;

public abstract class Burger implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
