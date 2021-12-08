package main.mealplanner.repository;

import main.mealplanner.model.NutritionInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NutritionInfoRepository extends JpaRepository<NutritionInfo,Long > {
    Optional<NutritionInfo>findByRecipeName(String recipeName);

}
