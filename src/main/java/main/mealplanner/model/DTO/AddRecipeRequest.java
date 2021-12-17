package main.mealplanner.model.DTO;

import org.springframework.lang.NonNull;

import java.util.List;

public class AddRecipeRequest {

    private String recipeName;
    private String recipe1;
    private String recipe2;
    private String recipe3;
    private String recipe4;

    public List<String> returnIngredientNames() {
        return List.of(recipe1, recipe2, recipe3, recipe4);
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipe1() {
        return recipe1;
    }

    public void setRecipe1(String recipe1) {
        this.recipe1 = recipe1;
    }

    public String getRecipe2() {
        return recipe2;
    }

    public void setRecipe2(String recipe2) {
        this.recipe2 = recipe2;
    }

    public String getRecipe3() {
        return recipe3;
    }

    public void setRecipe3(String recipe3) {
        this.recipe3 = recipe3;
    }

    public String getRecipe4() {
        return recipe4;
    }

    public void setRecipe4(String recipe4) {
        this.recipe4 = recipe4;
    }
}
