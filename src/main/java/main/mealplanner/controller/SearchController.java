//package main.mealplanner.controller;
//
//import main.mealplanner.model.Ingredient;
//import main.mealplanner.service.IngredientService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//@Controller
//public class SearchController {
//    @Autowired
//    IngredientService service;
//
//    @GetMapping("/search")
//    public String showAddPage(ModelMap model) {
//        /*List<Ingredient> rez = service.getByName("Milk");
//        System.out.println(rez.toString());*/
//        model.addAttribute("food", new Ingredient());
//        return "search";
//    }
//    @PostMapping("/search")
//    public String add(ModelMap model, @ModelAttribute("food") Ingredient b, BindingResult result) {
//        if(result.hasErrors()) {
//            return "search";
//        }
//        System.out.println(b.toString());
//        List<Ingredient> rez = service.getByName(b.getName());
//
//        model.put("foods", rez);
//        return "search";
//    }
//}
