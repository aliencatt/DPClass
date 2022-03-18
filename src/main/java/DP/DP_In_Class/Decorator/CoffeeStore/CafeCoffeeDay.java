package DP.DP_In_Class.Decorator.CoffeeStore;

import DP.DP_In_Class.Decorator.Coffees.Coffee;
import DP.DP_In_Class.Decorator.Coffees.Espresso;
import DP.DP_In_Class.Decorator.Toppings.Mocha;
import DP.DP_In_Class.Decorator.Toppings.Toppings;

public class CafeCoffeeDay {

    Coffee coffee;
    Toppings toppings;

    public CafeCoffeeDay(Coffee coffee, Toppings toppings) {
        this.coffee = coffee;
        this.toppings = toppings;
    }

    public static void main(String[] args) {

        Coffee coffee = new Espresso();
        Toppings topping = new Mocha();

        System.out.println("Your order is " + coffee.getDescription());
        System.out.println("The topping you have selected is " + topping.ToppingName);
        System.out.println("Total cost of the coffee is " + ((int) coffee.cost() + (int) topping.cost));


    }

}
