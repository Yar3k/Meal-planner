package main.mealplanner;

import main.mealplanner.model.NutritionInfo;
import main.mealplanner.repository.NutritionInfoRepository;
import main.mealplanner.service.NutritionInfoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Component
public class DataInitializer {

    private final NutritionInfoService nutritionInfoService;
    private final NutritionInfoRepository nutritionInfoRepository;

    public DataInitializer(NutritionInfoService nutritionInfoService, NutritionInfoRepository nutritionInfoRepository) {
        this.nutritionInfoService = nutritionInfoService;
        this.nutritionInfoRepository = nutritionInfoRepository;
    }

    @PostConstruct
    public void init(){

        Optional<NutritionInfo> byRecipeName = nutritionInfoRepository.findByName("Pillsbury Golden Layer Buttermilk Biscuits Artificial Flavor Refrigerated Dough");
        NutritionInfo nutritionInfo = byRecipeName.get();
        System.out.println("ne rabotaet");

    }



}
