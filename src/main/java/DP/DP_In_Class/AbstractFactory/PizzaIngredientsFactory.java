package DP.DP_In_Class.AbstractFactory;

import DP.DP_In_Class.AbstractFactory.Ingredients.Cheese;
import DP.DP_In_Class.AbstractFactory.Ingredients.Dough;
import DP.DP_In_Class.AbstractFactory.Ingredients.Sauce;

interface PizzaIngredientsFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();
}
