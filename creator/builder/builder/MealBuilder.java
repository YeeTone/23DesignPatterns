package creator.builder.builder;

import creator.builder.items.Item;
import creator.builder.items.burger.ChickenBurger;
import creator.builder.items.burger.VegBurger;
import creator.builder.items.coldDrink.Coke;
import creator.builder.items.coldDrink.Pepsi;
import creator.builder.meal.Meal;

public class MealBuilder extends AbstractMealBuilder{

    public Item prepareVegBurger(){
        return new VegBurger();
    }

    @Override
    public Item prepareChickenBurger() {
        return new ChickenBurger();
    }

    @Override
    public Item prepareCoke() {
        return new Coke();
    }

    @Override
    public Item preparePepsi() {
        return new Pepsi();
    }
}
