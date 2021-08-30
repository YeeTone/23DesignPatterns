package behavior.iterator.iterator;

import behavior.iterator.food.Food;

public interface FoodIterator {

    boolean hasNext();
    Food nextFood();
}
