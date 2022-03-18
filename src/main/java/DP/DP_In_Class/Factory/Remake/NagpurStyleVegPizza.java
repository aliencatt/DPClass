package DP.DP_In_Class.Factory.Remake;

public class NagpurStyleVegPizza extends Pizza {
    NagpurStyleVegPizza() {
        super.name = "Nagpur Style Veg Pizza";
        super.sauce = "Chilly Sauce";
        super.dough = "Soft Dough";
    }

    public void lotsOfVeg() {
        System.out.println("Lots of veggies were added ");
    }

    public void recipe() {
        System.out.println("---- This is recipe of Nagpur Style Veggie Pizza. ---- ");
        System.out.println("Veggies \nDough \nChilly Sauce");
    }
}
