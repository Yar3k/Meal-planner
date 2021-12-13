package main.mealplanner.controller;

import main.mealplanner.model.DTO.NutritionValue;
import main.mealplanner.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;

    }

    @GetMapping(value = "/ingredient")
    public ModelAndView getNutritionValue(@RequestParam String name,
                                          @RequestParam double weight,
                                          ModelAndView modelAndView) {

             NutritionValue calculateNutrition = recipeService.calculateNutrition(name, weight);

        modelAndView.addObject("nutritionValue",calculateNutrition);
        return modelAndView;
    }

}
