package main.mealplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreatePlanController {
    @GetMapping("/create-plan")
    public String dbLoader(){
    return "create-plan";
    }
}
