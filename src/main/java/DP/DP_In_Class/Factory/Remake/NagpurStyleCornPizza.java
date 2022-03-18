package DP.DP_In_Class.Factory.Remake;

public class NagpurStyleCornPizza extends Pizza {
    NagpurStyleCornPizza() {
        name = "Nagpur Style Corn Pizza";
        sauce = "Chilly Sauce";
        dough = "Soft Dough";
    }

    public void LotsOfCorn() {
        System.out.println("Lots of corns were added");
    }

    public void recipe() {
        System.out.println("---- This is recipe of Nagpur Style Corn Pizza ----");
        System.out.println("Corn \nDough \nChilly Sauce");
    }
}
