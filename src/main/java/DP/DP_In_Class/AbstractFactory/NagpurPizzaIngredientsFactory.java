package DP.DP_In_Class.AbstractFactory;

import DP.DP_In_Class.AbstractFactory.Ingredients.*;

public class NagpurPizzaIngredientsFactory implements PizzaIngredientsFactory {
    public Dough createDough() {
        return new ThinDough();
    }

    public Sauce createSauce() {
        return new ChillySauce();
    }

    public Cheese createCheese() {
        return new CreamCheese();
    }

}
