package main.mealplanner.repository;


import main.mealplanner.model.Food;
import main.mealplanner.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient,Long > {
    List<Ingredient> findAll() ;
    List<Ingredient> findByNameLike(String name);
}
