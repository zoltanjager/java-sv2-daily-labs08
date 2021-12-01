package day02;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private List<Ingredient> ingredientList = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addIngredient(Ingredient requiredIngredient, Ingredient... ingredient) {
        ingredientList.add(requiredIngredient);
        if (ingredient.length > 0) {
            for (Ingredient actual : ingredient) {
                ingredientList.add(actual);
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

}
