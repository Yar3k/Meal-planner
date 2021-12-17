package main.mealplanner.service;

import main.mealplanner.model.DTO.AddRecipeRequest;
import main.mealplanner.model.Ingredient;
import main.mealplanner.model.Recipe;
import main.mealplanner.repository.IngredientRepository;
import main.mealplanner.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Recipe> findAll(){
        return recipeRepository.findAll();
    }

    public void addNewRecipe(AddRecipeRequest addRecipeRequest) {
        Recipe recipe = new Recipe();
        recipe.setName(addRecipeRequest.getRecipeName());

        if (!addRecipeRequest.returnIngredientNames().isEmpty()) {

            for (String ingredientName : addRecipeRequest.returnIngredientNames()) {
                Optional<Ingredient> ingredientByName = ingredientRepository.findByName(ingredientName);
                if (ingredientByName.isPresent()){
                    recipe.addIngredient(ingredientByName.get());
                }
            }
        }
        recipeRepository.save(recipe);
    }



    public void deleteById(long id) {
        Optional<Recipe> byId = recipeRepository.findById(id);
        if (byId.isPresent()) {
            Recipe recipe = byId.get();
            recipe.deleteIngredient();
            recipeRepository.deleteById(id);
        }
    }
}
