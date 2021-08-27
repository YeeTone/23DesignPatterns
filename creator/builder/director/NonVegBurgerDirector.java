package creator.builder.director;

import creator.builder.builder.AbstractMealBuilder;
import creator.builder.meal.Meal;

public class NonVegBurgerDirector extends Director{
    public NonVegBurgerDirector(AbstractMealBuilder builder) {
        super(builder);
    }

    @Override
    public Meal buildMeal() {
        Meal meal = new Meal();
        meal.addItem(mealBuilder.prepareChickenBurger());
        meal.addItem(mealBuilder.preparePepsi());

        return meal;
    }
}
