package main.mealplanner.controller;

import main.mealplanner.model.BMI;
import main.mealplanner.model.Food;
import main.mealplanner.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    FoodService service;

    @GetMapping("/search")
    public String showAddPage(ModelMap model) {
        List<Food> rez = service.getByName("Milk");
        System.out.println(rez.toString());
        model.addAttribute("food", new Food());
        return "search";
    }
    @PostMapping("/search")
    public String add(ModelMap model, @ModelAttribute("food") Food b, BindingResult result) {
        if(result.hasErrors()) {
            return "search";
        }
        System.out.println(b.toString());
        List<Food> rez = service.getByName(b.getName());

        model.put("foods", rez);
        return "search";
    }
}
