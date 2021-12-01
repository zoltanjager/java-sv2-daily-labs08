package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    @Test

    void testCreateIngredient() {
        Ingredient ingredient = new Ingredient("Liszt");

        assertEquals("Liszt", ingredient.getName());
    }

}