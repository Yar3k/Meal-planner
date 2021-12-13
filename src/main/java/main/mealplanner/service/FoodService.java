package main.mealplanner.service;

import main.mealplanner.model.Food;
import main.mealplanner.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodService {
    @Autowired
    private FoodRepository repository;

    public List<Food> getAllUsers() {
        return (List<Food>) repository.findAll();
    }

    public List<Food> getByName(String name) {
        return repository.findByNameLike("%"+name+"%");
    }

    public void add (Food food){
        repository.save(food);
    }
}
