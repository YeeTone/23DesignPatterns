package creator.builder.director;

import creator.builder.builder.AbstractMealBuilder;
import creator.builder.meal.Meal;

public class VegMealDirector extends Director{

    public VegMealDirector(AbstractMealBuilder builder) {
        super(builder);
    }

    @Override
    public Meal buildMeal() {
        Meal meal = new Meal();
        meal.addItem(mealBuilder.prepareVegBurger());
        meal.addItem(mealBuilder.prepareCoke());

        return meal;
    }
}
