package main.mealplanner.model.DTO;

public class NutritionValue {

    private double protein;
    private double fat;
    private double carbohydrate;
    private double calories;

    public NutritionValue(double protein, double fat, double carbohydrate, int calories) {
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.calories = calories;
    }

    public NutritionValue() {
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
