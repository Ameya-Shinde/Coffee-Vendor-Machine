package implementations;

import enums.IngredientType;
import interfaces.IIngredientFiller;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;


public class CoffeeMachine {

    private IIngredientFiller iIngredientFiller;

    private CoffeeContex coffeeContex;



    public CoffeeMachine(){
        iIngredientFiller = new CoffeeIngredientFiller();
        coffeeContex = new CoffeeContex();
        HashMap<IngredientType, Float> hm = new HashMap<>();
            hm.put(IngredientType.Milk, 1000.0f);
            hm.put(IngredientType.Beans, 2500.0f);
            hm.put(IngredientType.Water, 1000.0f);
            fillIngredients(hm);
    }

    public void buyCoffee(String type){
        coffeeContex.setStrategy(type);
        coffeeContex.buy();
    }

    void fillIngredients(Map<IngredientType, Float> ingredients){
        for(Map.Entry<IngredientType, Float> entrySet : ingredients.entrySet()){
            iIngredientFiller.fill(entrySet.getKey(), entrySet.getValue());
        }
    }



}
