package main.mealplanner.config;

import com.github.javafaker.Faker;
import main.mealplanner.model.Ingredient;
import main.mealplanner.model.Recipe;
import main.mealplanner.repository.IngredientRepository;
import main.mealplanner.repository.RecipeRepository;
import main.mealplanner.service.IngredientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class DataInitializer {

    private final Faker faker = new Faker();


    private final RecipeRepository recipeRepository;
    private final IngredientInfoService ingredientInfoService;
    private final IngredientRepository ingredientRepository;

    @Autowired
    public DataInitializer(RecipeRepository recipeRepository,
                           IngredientInfoService ingredientInfoService,
                           IngredientRepository ingredientRepository) {

        this.recipeRepository = recipeRepository;
        this.ingredientInfoService = ingredientInfoService;
        this.ingredientRepository = ingredientRepository;
    }

    @PostConstruct
    public void init() {

        Recipe recipe = recipeRepository.findRecipeByName("Arepas");

        double sum = recipe.getIngredientList().stream()
                .mapToDouble(Ingredient::getCalories)
                .sum();

        double proteinCalorieSum = recipe.getIngredientList().stream()
                .mapToDouble(Ingredient::getProtein)
                .sum() * 4;

        System.out.println(proteinCalorieSum);
        System.out.println(sum);


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
//



//    gredient chicken = new Ingredient();
//        chicken.setName("chicken");
//        chicken.setCalories(150);
//        chicken.setProtein(30.00);
//        chicken.setFat(3.0);
//        chicken.setCarbohydrate(0.01);
//
//        Recipe fried = new Recipe();
//        fried.setName("fried");
//
//        fried.addIngredient(chicken);
//        Recipe fromDB = recipeRepository.save(fried);
//
//        Optional<Recipe> optionalRecipe = recipeRepository.findById(fromDB.getId());
//        Recipe recipe = optionalRecipe.get();
//        System.out.println(recipe);
//        List<Ingredient> ingredientList = recipe.getIngredientList();
//        ingredientList.forEach(System.out::println);


    }


}
