package DP.DP_In_Class.Factory.Remake;

public class MumbaiStyleCornPizza extends Pizza {
    MumbaiStyleCornPizza() {
        name = "Mumbai Style Corn Pizza";
        sauce = "Tomato Sauce";
        dough = "Hard Dough";
    }

    public void LotsOfCorn() {
        System.out.println("Lots of Corns were added");
    }

    public void recipe() {
        System.out.println("----  This is recipe of Mumbai Style Corn Pizza. ---- ");
        System.out.println("Corn \nDough \nTomato Sauce");
    }

}
