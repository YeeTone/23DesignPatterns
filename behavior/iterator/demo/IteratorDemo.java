package behavior.iterator.demo;

import behavior.iterator.container.FoodContainer;
import behavior.iterator.container.FoodContainerImplement;
import behavior.iterator.food.Food;
import behavior.iterator.iterator.FoodIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        FoodContainer foodContainer = new FoodContainerImplement();
        foodContainer.addFood(new Food("薯条"));
        foodContainer.addFood(new Food("汉堡包"));
        foodContainer.addFood(new Food("可乐"));

        FoodIterator foodIterator = foodContainer.getFoodIterator();
        System.out.println(foodIterator.nextFood());
        System.out.println(foodIterator.nextFood());
        System.out.println(foodIterator.nextFood());
        System.out.println(foodIterator.nextFood());

        foodIterator = foodContainer.getFoodIterator();
        System.out.println(foodIterator.nextFood());
    }
}
