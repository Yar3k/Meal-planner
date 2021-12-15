package main.mealplanner.controller;

import main.mealplanner.model.DTO.AddRecipeRequest;
import main.mealplanner.model.Ingredient;
import main.mealplanner.model.Recipe;
import main.mealplanner.repository.IngredientRepository;
import main.mealplanner.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(value = "/recipe")
public class RecipeController {
    private final RecipeService recipeService;
    private final IngredientRepository ingredientRepository;

    public RecipeController(RecipeService recipeService, IngredientRepository ingredientRepository) {
        this.recipeService = recipeService;
        this.ingredientRepository = ingredientRepository;
    }


    @GetMapping("/show-form")
    public ModelAndView getAddRecipeForm(ModelAndView modelAndView){
        List<Ingredient> all = ingredientRepository.findAll();
        all.sort(Comparator.comparing(Ingredient::getName));
        List<Recipe> recipes = recipeService.findAll();
        return new ModelAndView("add-recipe-form",
                Map.of("addRecipeRequest", new AddRecipeRequest(),
                "recipes",recipes,
                        "ingredients",all));
    }

    @PostMapping("/add-recipe")
    public ModelAndView addNewRecipe(@ModelAttribute AddRecipeRequest addRecipeRequest){

        recipeService.addNewRecipe(addRecipeRequest);
        return new ModelAndView("redirect:/recipe/show-form");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteRecipe(@PathVariable long id){
        recipeService.deleteById(id);
        return new ModelAndView("redirect:/recipe/show-form");
    }

}
