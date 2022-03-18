package DP.DP_In_Class.Factory.Remake;

public class NagpurPizzaStore extends PizzaStore {
    Pizza createPizza(String name) {
        Pizza p = null;
        if (name.equalsIgnoreCase("Nagpur Style Cheese Pizza")) {
            p = new NagpurStyleCheesePizza();
        } else if (name.equalsIgnoreCase("Nagpur Style Corn Pizza")) {
            p = new NagpurStyleCornPizza();
        } else if (name.equalsIgnoreCase("Nagpur Style Veg Pizza")) {
            p = new NagpurStyleVegPizza();
        }
        return p;
    }

}
