package main.mealplanner.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private double calories;
    private double protein;
    private double carbs;
    private double fat;

    @OneToMany(mappedBy = "recipe",
            fetch = FetchType.EAGER,
            cascade = {CascadeType.MERGE,CascadeType.PERSIST}
    )
    List<Ingredient> ingredientList = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {

        this.calories += ingredient.getCalories();
        this.protein += ingredient.getProtein();
        this.carbs += ingredient.getCarbohydrate();
        this.fat += ingredient.getFat();

        this.calories=new BigDecimal(this.calories).setScale(2, RoundingMode.HALF_UP).doubleValue();
        this.protein=new BigDecimal(this.protein).setScale(2, RoundingMode.HALF_UP).doubleValue();
        this.carbs=new BigDecimal(this.carbs).setScale(2, RoundingMode.HALF_UP).doubleValue();
        this.fat=new BigDecimal(this.fat).setScale(2, RoundingMode.HALF_UP).doubleValue();


        this.ingredientList.add(ingredient);
        ingredient.setRecipe(this);
    }

    public void deleteIngredient(){
        ingredientList.forEach(ingredient -> ingredient.setRecipe(null));
        ingredientList.clear();
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
