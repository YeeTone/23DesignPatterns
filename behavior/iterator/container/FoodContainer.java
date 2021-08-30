package behavior.iterator.container;

import behavior.iterator.food.Food;
import behavior.iterator.iterator.FoodIterator;

public interface FoodContainer {
    void addFood(Food f);
    FoodIterator getFoodIterator();
}
