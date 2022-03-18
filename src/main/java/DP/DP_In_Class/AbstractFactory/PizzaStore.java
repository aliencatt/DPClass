package DP.DP_In_Class.AbstractFactory;

public abstract class PizzaStore {
    Pizza p;

    //factory method
    abstract Pizza createPizza(String name);

    void orderPizza(String name) {
        p = createPizza(name);
        p.prepare();
        p.bake();
        p.cut();
        p.pack();

    }

}
