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

    private final Faker faker = new Faker();
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

        List<Ingredient> ingredients = new ArrayList<>();
//          Add 
//        for (int i = 0; i < 50; i++) {
//
//            Ingredient ingredient = new Ingredient();
//
//            ingredient.setName(faker.food().ingredient());
//            ingredient.setCalories(faker.random().nextInt(1));
//            ingredient.setProtein(faker.random().nextDouble());
//            ingredient.setFat(faker.random().nextDouble());
//            ingredient.setCarbohydrate(faker.random().nextDouble());
//            ingredients.add(ingredient);
//
//        }

     // find by name function
        recipeService.addNewRecipe(ingredients, "iichnica");

        Optional<Recipe> byId = recipeRepository.findById(4452l);
        System.out.println(byId);


        recipeService.findRecipesByNutrient(6, 0.7, 5, 4);


// populate table

//        for (int i = 0; i < 100; i++) {
//            Recipe recipe = new Recipe();
//            recipe.setName(faker.food().dish());
//
//            for (int j = 0; j < 10; j++) {
//                Ingredient chicken = new Ingredient();
//                chicken.setName(faker.food().ingredient());
//                chicken.setCalories(faker.random().nextInt(1));
//                chicken.setProtein(faker.random().nextDouble());
//                chicken.setFat(faker.random().nextDouble());
//                chicken.setCarbohydrate(faker.random().nextDouble());
//                recipe.addIngredient(chicken);
//            }
//            recipeRepository.save(recipe);
//        }
    }
}
