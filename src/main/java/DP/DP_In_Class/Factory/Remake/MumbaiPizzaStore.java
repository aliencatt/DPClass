package DP.DP_In_Class.Factory.Remake;

public class MumbaiPizzaStore extends PizzaStore {
    Pizza createPizza(String name) {
        Pizza p = null;
        if (name.equalsIgnoreCase("Mumbai Style Cheese Pizza")) {
            p = new MumbaiStyleCheesePizza();

        } else if (name.equalsIgnoreCase("Mumbai Style Corn Pizza")) {
            p = new MumbaiStyleCornPizza();
        } else if (name.equalsIgnoreCase("Mumbai Style Veg Pizza")) {
            p = new MumbaiStyleVegPizza();
        }
        return p;
    }
}
