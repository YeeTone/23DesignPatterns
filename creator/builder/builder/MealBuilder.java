package creator.builder.builder;

import creator.builder.items.burger.ChickenBurger;
import creator.builder.items.burger.VegBurger;
import creator.builder.items.coldDrink.Coke;
import creator.builder.items.coldDrink.Pepsi;
import creator.builder.meal.Meal;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
