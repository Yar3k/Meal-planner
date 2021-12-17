package main.mealplanner.controller;

import main.mealplanner.config.BMICalculus;
import main.mealplanner.model.BMI;
import main.mealplanner.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BMIController {
    @GetMapping("/bmi")
    public String showAddPage(ModelMap model) {
        model.addAttribute("bmi", new BMI(0, 0));
        return "bmindex";
    }
    @PostMapping("/bmi")
    public String add(ModelMap model, @ModelAttribute("bmi") BMI b, BindingResult result) {
        if(result.hasErrors()) {
            return "bmi";
        }
        new BMICalculus().Calculate(b);
        model.addAttribute("bmi", b);
        return "bmindex";
    }
}
