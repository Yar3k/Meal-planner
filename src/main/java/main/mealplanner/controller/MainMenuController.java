package main.mealplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMenuController {

    @GetMapping("/main-menu")
    public String menu(ModelMap model) {

            return "main-menu";
        }
    @GetMapping("/meal-planner")
    public String mealPlaner(ModelMap model) {

        return "meal-planner";
    }



    }
