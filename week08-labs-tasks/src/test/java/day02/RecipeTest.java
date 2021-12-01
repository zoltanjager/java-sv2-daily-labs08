package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test

    void testCreateRecipeWithName() {

        Recipe recipe = new Recipe("Palacsinta");

        assertEquals("Palacsinta", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0, recipe.getIngredientList().size());

    }

    @Test

    void testCreateRecipeWithNameAndDescription() {

        Recipe recipe = new Recipe("Palacsinta", "teljes kiőrlésű");

        assertEquals("Palacsinta", recipe.getName());
        assertEquals("teljes kiőrlésű", recipe.getDescription());
        assertEquals(0, recipe.getIngredientList().size());
    }


    @Test

    void testAddIngredientWithOneIngredient() {

        Recipe recipe = new Recipe("Palacsinta");

        recipe.addIngredient(new Ingredient("Liszt"));

        assertEquals(1,recipe.getIngredientList().size());

    }

    @Test

    void testAddIngredientWithMoreIngredients() {

        Recipe recipe = new Recipe("Palacsinta");

        recipe.addIngredient(new Ingredient("Liszt"), new Ingredient("Tojás"), new Ingredient("Tej"));

        assertEquals(3,recipe.getIngredientList().size());
    }


}