package main.mealplanner.service;

import main.mealplanner.model.DTO.NutritionValue;
import main.mealplanner.model.Ingredient;
import main.mealplanner.model.Recipe;
import main.mealplanner.repository.IngredientRepository;
import main.mealplanner.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;
    private final IngredientRepository ingredientRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    public List<Recipe> findRecipesByNutrient(double calories, double protein, double carbohydrates, double fat) {
        List<Recipe> allRecipes = recipeRepository.findAll();
        List<Recipe> result = new ArrayList<>();

        for (Recipe recipe : allRecipes) {
            if ((getTotalCaloriesByRecipe(recipe) <= calories)
                    && (getTotalProteinByRecipe(recipe) >= protein)
                    && (getTotalFatByRecipe(recipe) < fat)
                    && (getTotalCarbohydrateByRecipe(recipe) < carbohydrates)) {
                result.add(recipe);

            }
        }
        return result;

    }


    private double getTotalCaloriesByRecipe(Recipe recipe) {
        double totalCalories = 0;
        for (Ingredient ingredient : recipe.getIngredientList()) {
            totalCalories = +ingredient.getCalories();
        }
        return totalCalories;
    }

    private double getTotalProteinByRecipe(Recipe recipe) {
        double totalProtein = 0;
        for (Ingredient ingredient : recipe.getIngredientList()) {
            totalProtein = +ingredient.getProtein();
        }
        return totalProtein;
    }

    private double getTotalFatByRecipe(Recipe recipe) {
        double totalFat = 0;
        for (Ingredient ingredient : recipe.getIngredientList()) {
            totalFat = +ingredient.getFat();
        }
        return totalFat;
    }

    private double getTotalCarbohydrateByRecipe(Recipe recipe) {
        double totalCarbohydrate = 0;
        for (Ingredient ingredient : recipe.getIngredientList()) {
            totalCarbohydrate = +ingredient.getCarbohydrate();
        }
        return totalCarbohydrate;
    }

    public void addNewRecipe(List<Ingredient> ingredientList, String name) {
        Recipe recipe = new Recipe();
        recipe.setName(name);

        for (Ingredient ingredient : ingredientList) {
            recipe.addIngredient(ingredient);
        }
        recipeRepository.save(recipe);
    }
    /**
     * Service to return nutrition value of ingredient
     */
    public NutritionValue calculateNutrition(String ingredientName, double weight) {
        Optional<Ingredient> ingredientFromDb = ingredientRepository.findByName(ingredientName);
        NutritionValue nutritionValue = new NutritionValue();

        if (ingredientFromDb.isPresent()) {

            Ingredient ingredient = ingredientFromDb.get();
            nutritionValue.setFat(ingredient.getFat() * weight);
            nutritionValue.setCarbohydrate(ingredient.getCarbohydrate() * weight);
            nutritionValue.setCalories(ingredient.getCalories() * weight);
            nutritionValue.setProtein(ingredient.getProtein() * weight);

            return nutritionValue;

        }
        throw new NoSuchElementException("Ingredient not present in database");
    }
}
