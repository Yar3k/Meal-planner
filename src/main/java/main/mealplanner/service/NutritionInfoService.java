package main.mealplanner.service;

import main.mealplanner.model.NutritionInfo;
import main.mealplanner.repository.NutritionInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class NutritionInfoService {
    private final NutritionInfoRepository nutritionInfoRepository;

    public NutritionInfoService(NutritionInfoRepository nutritionInfoRepository) {
        this.nutritionInfoRepository = nutritionInfoRepository;

    }
    public NutritionInfo findByName(String recipeName){
        Optional<NutritionInfo> byRecipeName = nutritionInfoRepository.findByRecipeName(recipeName);
        if (byRecipeName.isPresent()){
            return byRecipeName.get();
        }
        throw new RuntimeException("recipe name not found");
    }
}
