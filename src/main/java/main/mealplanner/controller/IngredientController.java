package main.mealplanner.controller;

import main.mealplanner.model.DTO.NutritionValue;
import main.mealplanner.model.Ingredient;
import main.mealplanner.repository.IngredientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/ingredient")
public class IngredientController {
    private final IngredientRepository ingredientRepository;


    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;

    }

    @GetMapping(value = "/show-form")
    public ModelAndView showForm(ModelAndView modelAndView, @ModelAttribute Ingredient ingredient){
        List<Ingredient> allIngredients = ingredientRepository.findAll();
        allIngredients.sort(Comparator.comparing(Ingredient::getName));

        modelAndView.addObject("ingredients",allIngredients);
        modelAndView.addObject("result",ingredient);
        modelAndView.addObject("ingredient", new Ingredient());
        modelAndView.setViewName("show-ingredient");

        return modelAndView;
    }
    @PostMapping(value = "/nutrition")
    public ModelAndView processNutrition(@ModelAttribute Ingredient ingredient,
                                         ModelAndView modelAndView,
                                         RedirectAttributes redirectAttributes){
        Optional<Ingredient> optionalIngredient = ingredientRepository.findByName(ingredient.getName());
        Ingredient returnIngredient = optionalIngredient.get();
        redirectAttributes.addFlashAttribute("ingredient",returnIngredient);
        modelAndView.setViewName("redirect:/ingredient/show-form");
        return modelAndView;
    }
}
