package behavior.iterator.container;

import behavior.iterator.food.Food;
import behavior.iterator.iterator.FoodIterator;
import behavior.iterator.iterator.FoodIteratorImplement;

import java.util.ArrayList;
import java.util.List;

public class FoodContainerImplement implements FoodContainer{
    private final List<Food> foodElements = new ArrayList<>();

    @Override
    public void addFood(Food f){
        this.foodElements.add(f);
    }

    @Override
    public FoodIterator getFoodIterator(){
        return new FoodIteratorImplement(this.foodElements);
    }

}
