package main.mealplanner.service;

import main.mealplanner.model.Ingredient;
import main.mealplanner.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class IngredientInfoService {
    private final IngredientRepository ingredientRepository;

    public IngredientInfoService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;

    }
    public Ingredient findByName(String IngredientName){
        Optional<Ingredient> byIngredient = ingredientRepository.findByName(IngredientName);
        if (byIngredient.isPresent()){
            return byIngredient.get();
        }
        throw new RuntimeException("ingredient name not found");
    }
}

