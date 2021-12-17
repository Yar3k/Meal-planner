//package main.mealplanner.controller;
//
//import java.util.List;
//
//import main.mealplanner.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import main.mealplanner.model.User;
//import main.mealplanner.service.UserService;
//
//@RestController
//public class UserControllerRest {
//	@Autowired
//	UserService service;
//
//	@GetMapping("/list-users-json")
//	public List<User> retrieveQuestionsForSurvey() {
//		return service.getAllUsers();
//	}
//}
