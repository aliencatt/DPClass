package DP.DP_In_Class.AbstractFactory;

public class NagpurPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) {

        Pizza p = null;

        PizzaIngredientsFactory pif = new NagpurPizzaIngredientsFactory();

        if (name.equalsIgnoreCase("Cheese Pizza")) {
            p = new CheesePizza(pif);
        } else if (name.equalsIgnoreCase("Corn Pizza")) {
            p = new CornPizza(pif);
        }

        return p;
    }

}
