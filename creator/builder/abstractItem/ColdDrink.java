package creator.builder.abstractItem;

import creator.builder.interface0.Item;
import creator.builder.interface0.Packing;
import creator.builder.packs.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
