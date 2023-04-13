package org.example;
import implementations.CoffeeMachine;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Coffee you want to order \n 1. Expresso  \n Price = 4$ \n 2. Latte  \n Price = 7$ \n 3. Cappiccino \n Price = 6$");
        int n = sc.nextInt();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        switch (n){
            case 1:
                coffeeMachine.buyCoffee("Expresso");
                break;
            case 2:
                coffeeMachine.buyCoffee("Latte");
                break;
            case 3 :
                coffeeMachine.buyCoffee("Cappicino");
                break;
            default:
                System.out.println("No Such Coffee Option");
                }
        }




}

