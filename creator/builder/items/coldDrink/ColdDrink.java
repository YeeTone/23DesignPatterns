package creator.builder.items.coldDrink;

import creator.builder.packs.Packing;
import creator.builder.items.Item;
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
