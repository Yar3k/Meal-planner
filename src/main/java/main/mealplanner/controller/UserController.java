package main.mealplanner.controller;

import java.util.List;

import main.mealplanner.model.User;
import main.mealplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import main.mealplanner.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	public UserController() {
		super();
	}
	
	public UserController(UserService service) {
		super();
		this.service = service;
	}

	@GetMapping("/list-users") 				// http://localhost:8080/list-prekes
	public String showPrekes(ModelMap model) {
		model.put("users", service.getAllUsers());
		return "list-users"; // view resolver /WEB-INF/jsp/list-user.jsp
	}

	// http://localhost:8080/add-user
	@GetMapping("/add-user")
	public String showAddPage(ModelMap model) {
		model.addAttribute("user", new User("", "", ""));
		return "user";
	}

	@PostMapping("/add-user")
	public String add(ModelMap model, @ModelAttribute("user") User u, BindingResult result) {
		if(result.hasErrors()) {
			return "user";
		}
		System.out.println(u.toString());
		service.add(u);
		return "redirect:/list-users";
	}
}
