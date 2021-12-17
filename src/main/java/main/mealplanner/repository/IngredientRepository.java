package main.mealplanner.repository;


import main.mealplanner.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient,Long > {

//    @Query(value = "SELECT * FROM ingredient WHERE name = :ingredientName",
//            nativeQuery = true)
    Optional<Ingredient> findByName(String ingredientName);



}
