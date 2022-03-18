package DP.DP_In_Class.Factory.Remake;

public abstract class PizzaStore {
    Pizza p;

    abstract Pizza createPizza(String name);

    void orderPizza(String name) {
        p = createPizza(name);
        p.recipe();
        p.bake();
        p.cut();
        p.pack();

    }

}
