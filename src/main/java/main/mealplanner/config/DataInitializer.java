package main.mealplanner.config;

import com.github.javafaker.Faker;
import main.mealplanner.model.Ingredient;
import main.mealplanner.model.Recipe;
import main.mealplanner.repository.IngredientRepository;
import main.mealplanner.repository.RecipeRepository;
import main.mealplanner.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DataInitializer {

    private final RecipeService recipeService;
    private final RecipeRepository recipeRepository;
    private final IngredientRepository ingredientRepository;

    @Autowired
    public DataInitializer(RecipeService recipeService,
                           RecipeRepository recipeRepository,
                           IngredientRepository ingredientRepository) {
        this.recipeService = recipeService;
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    @PostConstruct
    public void init() {

//       Recipe recipe = new Recipe();
//       recipe.setName("beer for Jarek");
//       recipe.addIngredient(ingredientRepository.findByName("Beer").get());
//       recipeRepository.save(recipe);



    }
}
