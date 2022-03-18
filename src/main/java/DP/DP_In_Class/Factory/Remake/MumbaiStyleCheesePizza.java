package DP.DP_In_Class.Factory.Remake;

class MumbaiStyleCheesePizza extends Pizza {
    MumbaiStyleCheesePizza() {
        name = "Mumbai Style Cheese Pizza";
        sauce = "Tomato Sauce";
        dough = "Hard Dough";
    }

    public void LotsOfCheese() {
        System.out.println("Lots of Cheese were added");
    }

    public void recipe() {
        System.out.println("----  This is recipe of Mumbai Style Cheese Pizza. ---- ");
        System.out.println("Cheese \nDough \nTomato Sauce");
    }

}
