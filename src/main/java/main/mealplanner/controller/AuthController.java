package main.mealplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/sign-up")
    public String signUp(){
        return "sign-up";
    }

    @GetMapping("/log-in")
    public String logIn(){ return "login";
    }
}


