package behavior.iterator.iterator;

import behavior.iterator.food.Food;

import java.util.List;

public class FoodIteratorImplement implements FoodIterator{

    private final List<Food> foodElements;
    private int index;

    public FoodIteratorImplement(List<Food> foodElements){
        this.foodElements = foodElements;
    }

    @Override
    public boolean hasNext() {
        return this.index< foodElements.size();
    }

    @Override
    public Food nextFood() {
        if(this.hasNext()){
            Food need = this.foodElements.get(this.index);
            this.index++;
            return need;
        }else {
            return null;
        }
    }
}
