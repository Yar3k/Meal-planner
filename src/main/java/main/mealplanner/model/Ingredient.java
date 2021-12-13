package main.mealplanner.model;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA autogenerates value of id
    private int id;
    private String name;
    private String calories;
    private String fat_g;
    private String protein_g;
    private String carbohydrate_g;

//    @ManyToOne
//    @JoinColumn(name = "recipe_id")
//    private Recipe recipe;
//
//    public Recipe getRecipe() {
//        return recipe;
//    }
//
//    public void setRecipe(Recipe recipe) {
//        this.recipe = recipe;
//    }
//
//    public Ingredient() {
//    }
//
//    public Ingredient(String name) {
//        this.name=name;
//    }
//
//    public Ingredient(String name, String calories, String fat_g, String protein_g, String carbohydrate_g) {
//        this.name = name;
//        this.calories = calories;
//        this.fat_g = fat_g;
//        this.protein_g = protein_g;
//        this.carbohydrate_g = carbohydrate_g;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getFat_g() {
        return fat_g;
    }

    public void setFat_g(String fat_g) {
        this.fat_g = fat_g;
    }

    public String getProtein_g() {
        return protein_g;
    }

    public void setProtein_g(String protein_g) {
        this.protein_g = protein_g;
    }

    public String getCarbohydrate_g() {
        return carbohydrate_g;
    }

    public void setCarbohydrate_g(String carbohydrate_g) {
        this.carbohydrate_g = carbohydrate_g;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", fat_g='" + fat_g + '\'' +
                ", protein_g='" + protein_g + '\'' +
                ", carbohydrate_g='" + carbohydrate_g + '\'' +
                '}';
    }
}
