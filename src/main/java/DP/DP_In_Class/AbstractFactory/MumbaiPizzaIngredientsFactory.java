package DP.DP_In_Class.AbstractFactory;

import DP.DP_In_Class.AbstractFactory.Ingredients.*;

public class MumbaiPizzaIngredientsFactory implements PizzaIngredientsFactory {
    public Dough createDough() {
        return new ThickDough();
    }

    public Sauce createSauce() {
        return new TomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

}
