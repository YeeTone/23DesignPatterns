package creator.builder.items.burger;

import creator.builder.packs.Packing;
import creator.builder.items.Item;
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
