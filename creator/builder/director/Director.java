package creator.builder.director;

import creator.builder.builder.AbstractMealBuilder;
import creator.builder.meal.Meal;

public abstract class Director {
    protected AbstractMealBuilder mealBuilder;

    public Director(AbstractMealBuilder builder){
        this.mealBuilder = builder;
    }

    public abstract Meal buildMeal();
}
