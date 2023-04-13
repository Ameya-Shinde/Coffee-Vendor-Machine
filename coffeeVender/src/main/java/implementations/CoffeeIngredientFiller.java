package implementations;

import enums.IngredientType;
import interfaces.IIngredientFiller;

import java.util.Map;

public class CoffeeIngredientFiller implements IIngredientFiller {
    private IngredientHolder ingredientHolder;

    CoffeeIngredientFiller(){
        ingredientHolder = IngredientHolder.getInstance();
    }

    @Override
    public void fill(IngredientType ingredientType, float quantity) {
        ingredientHolder.setIngredientQuantity(ingredientType,quantity);
    }
}
