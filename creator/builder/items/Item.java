package creator.builder.items;

import creator.builder.packs.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
