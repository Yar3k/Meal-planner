package main.mealplanner.config;

import com.github.javafaker.Faker;
import main.mealplanner.repository.IngredientRepository;
import main.mealplanner.repository.RecipeRepository;
import main.mealplanner.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final Faker faker = new Faker();
    private final RecipeService recipeService;

    private final RecipeRepository recipeRepository;

    private final IngredientRepository ingredientRepository;

    @Autowired
    public DataInitializer(RecipeService recipeService, RecipeRepository recipeRepository,

                           IngredientRepository ingredientRepository) {
        this.recipeService = recipeService;

        this.recipeRepository = recipeRepository;

        this.ingredientRepository = ingredientRepository;
    }

    @PostConstruct
    public void init() {
        recipeService.findRecipesByNutrient(6,0.7,5,4);



//        Recipe recipe = recipeRepository.findRecipeByName("Arepas");
//
//        double sum = recipe.getIngredientList().stream()
//                .mapToDouble(Ingredient::getCalories)
//                .sum();
//
//        double proteinCalorieSum = recipe.getIngredientList().stream()
//                .mapToDouble(Ingredient::getProtein)
//                .sum() * 4;
//
//        System.out.println(proteinCalorieSum);
//        System.out.println(sum);
//
//
//        for (int i = 0; i < 100; i++) {
//            Recipe recipe = new Recipe();
//            recipe.setName(faker.food().dish());
//
//            for (int j = 0; j < 10 ; j++) {
//                Ingredient chicken = new Ingredient();
//                chicken.setName(faker.food().ingredient());
//                chicken.setCalories(faker.random().nextDouble());
//                chicken.setProtein(faker.random().nextDouble());
//                chicken.setFat(faker.random().nextDouble());
//                chicken.setCarbohydrate(faker.random().nextDouble());
//                recipe.addIngredient(chicken);
//            }
//            recipeRepository.save(recipe);
//        }





    }



}
