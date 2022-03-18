package DP.DP_In_Class.AbstractFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientsFactory pif;

    CheesePizza(PizzaIngredientsFactory pif) {
        this.pif = pif;
    }


    public void prepare() {
        System.out.println("Lots of Cheese");
    }
}
