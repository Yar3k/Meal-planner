package main.mealplanner.config;

import main.mealplanner.model.BMI;

public class BMICalculus {
    public void Calculate(BMI b){
        try {
            double bmi = b.getWeight() / Math.pow(b.getHeight(), 2) * 10000;
            b.setResult(bmi);
            if (bmi <= 18.5) {
                b.setStatus("underweight");
            } else if (bmi <= 25) {
                b.setStatus("normal");
            } else if (bmi <= 30) {
                b.setStatus("overweight");
            } else {
                b.setStatus("obese");
            }
        }catch (Exception e){
            b.setStatus("");
            b.setResult(0.0);
        }
    }
}
