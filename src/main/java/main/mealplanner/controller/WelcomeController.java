package main.mealplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;

@Controller
public class WelcomeController {
	
	@GetMapping("/") //http://localhost:8080
	public String showRootPage(ModelMap model) {
		model.put("name", "ANONYMOUS");
		return "welcome"; // view resolver welcome.jsp
	}
	
	@GetMapping("/welcome") // http://localhost:8080/welcome?name=Antanas
	public String showWelcomePage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "welcome"; // view resolver welcome.jsp
	}



}
