package DP.DP_In_Class.AbstractFactory;

public class CornPizza extends Pizza {

    PizzaIngredientsFactory pif;

    CornPizza(PizzaIngredientsFactory pif) {
        this.pif = pif;
    }

    public void prepare() {
        System.out.println("Lots of Corn");
    }
}
