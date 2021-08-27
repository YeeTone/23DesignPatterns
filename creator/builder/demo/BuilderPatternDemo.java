package creator.builder.demo;

import creator.builder.builder.AbstractMealBuilder;
import creator.builder.builder.MealBuilder;
import creator.builder.director.Director;
import creator.builder.director.NonVegBurgerDirector;
import creator.builder.director.VegMealDirector;
import creator.builder.meal.Meal;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        AbstractMealBuilder abstractMealBuilder = new MealBuilder();

        Director vegMealDirector = new VegMealDirector(abstractMealBuilder);
        Director nonVegMealDirector = new NonVegBurgerDirector(abstractMealBuilder);

        Meal veg = vegMealDirector.buildMeal();
        System.out.println("Veg Meal");
        veg.showItems();
        System.out.println("Total Cost: "+veg.getCost());

        Meal nonVeg = nonVegMealDirector.buildMeal();
        System.out.println("NonVeg Meal");
        nonVeg.showItems();
        System.out.println("Total Cost: "+nonVeg.getCost());


        /*MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegBurger();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());*/
    }
}
