package creator.builder.builder;

import creator.builder.concreteItem.burger.ChickenBurger;
import creator.builder.concreteItem.burger.VegBurger;
import creator.builder.concreteItem.coldDrink.Coke;
import creator.builder.concreteItem.coldDrink.Pepsi;
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
