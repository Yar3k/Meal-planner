package main.mealplanner.repository;

import main.mealplanner.model.Food;
import main.mealplanner.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Integer> {
    List<Food> findAll() ;
    List<Food> findByNameLike(String name);

}
