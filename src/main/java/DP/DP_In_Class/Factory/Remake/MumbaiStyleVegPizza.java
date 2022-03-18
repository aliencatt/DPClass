package DP.DP_In_Class.Factory.Remake;

public class MumbaiStyleVegPizza extends Pizza {
    MumbaiStyleVegPizza() {
        name = "Mumbai Style Veg Pizza";
        sauce = "Tomato Sauce";
        dough = "Hard Dough";
    }

    public void lotsOfVeg() {
        System.out.println("Lots of veggies were added ");
    }

    public void recipe() {
        System.out.println("---- This is recipe of Mumbai Style Veggie Pizza. ---- ");
        System.out.println("Veggies \nDough \nTomato Sauce");
    }
}
