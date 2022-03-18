package DP.DP_In_Class.AbstractFactory;

import DP.DP_In_Class.AbstractFactory.Ingredients.Cheese;
import DP.DP_In_Class.AbstractFactory.Ingredients.Dough;
import DP.DP_In_Class.AbstractFactory.Ingredients.Sauce;

public abstract class Pizza {
    Sauce s;
    Dough d;
    Cheese c;

    abstract public void prepare();

    public void bake() {
        System.out.println("Pizza is being baked.");
    }

    public void cut() {
        System.out.println("Pizza is cut into pieces ");
    }

    public void pack() {
        System.out.println("Pizza is packed.");
    }
}
