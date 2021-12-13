package main.mealplanner.service;

import main.mealplanner.model.Ingredient;
import main.mealplanner.model.Recipe;
import main.mealplanner.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findRecipesByNutrient(double calories, double protein, double carbohydrates, double fat){
        List<Recipe> allRecipes = recipeRepository.findAll();
        List<Recipe> result = new ArrayList<>();

        for (Recipe recipe : allRecipes){
            if ((getTotalCaloriesByRecipe(recipe) <= calories)
                    && (getTotalProteinByRecipe(recipe)>= protein)
                    && (getTotalFatByRecipe(recipe) < fat )
                    && (getTotalCarbohydrateByRecipe(recipe) < carbohydrates)){
                result.add(recipe);

            }
        }
        return result;

    }

    private int getTotalCaloriesByRecipe(Recipe recipe){
        int totalCalories = 0;
        for (Ingredient ingredient : recipe.getIngredientList()) {
            totalCalories =+ ingredient.getCalories();
        }
        return totalCalories;
    }
    private double getTotalProteinByRecipe(Recipe recipe){
        double totalProtein = 0;
        for (Ingredient ingredient : recipe.getIngredientList()){
            totalProtein =+ ingredient.getProtein();
        }
        return totalProtein;
    }
    private double getTotalFatByRecipe(Recipe recipe){
        double totalFat = 0;
        for (Ingredient ingredient : recipe.getIngredientList()){
            totalFat =+ ingredient.getFat();
        }
        return totalFat;
    }
    private double getTotalCarbohydrateByRecipe(Recipe recipe){
        double totalCarbohydrate = 0;
        for (Ingredient ingredient : recipe.getIngredientList()){
            totalCarbohydrate =+ ingredient.getCarbohydrate();
        }
        return totalCarbohydrate;
    }

    public void addNewRecipe(List<Ingredient> ingredientList, String name){
        Recipe recipe = new Recipe();
        recipe.setName(name);

        for (Ingredient ingredient : ingredientList) {
            recipe.addIngredient(ingredient);
        }
        recipeRepository.save(recipe);
    }
}
