package implementations;

import interfaces.ICoffeeStrategy;

import java.util.Objects;

public class CoffeeContex {

    private ICoffeeStrategy coffeeStrategy;

    void setStrategy(String coffeeType){
        if(coffeeType.equals("Latte")){
            coffeeStrategy = new LatteStrategy();
        }else if(Objects.equals(coffeeType,"Cappicino")){
            coffeeStrategy = new CapiccinoStrategy();
        }else{
            coffeeStrategy = new ExpressoStrategy();
        }
    }

    void buy(){
        coffeeStrategy.createCoffee();
    }
}
