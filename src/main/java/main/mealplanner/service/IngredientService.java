package main.mealplanner.service;

import main.mealplanner.model.Ingredient;
import main.mealplanner.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientService {

    @Autowired
    private IngredientRepository repository;

    public List<Ingredient> getAllUsers() {
        return (List<Ingredient>) repository.findAll();
    }

    public List<Ingredient> getByName(String name) {
        return repository.findByNameLike("%"+name+"%");
    }


    public void add (Ingredient food){
        repository.save(food);
    }
}
