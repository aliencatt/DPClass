package DP.DP_In_Class.Factory.Remake;

class NagpurStyleCheesePizza extends Pizza {
    NagpurStyleCheesePizza() {
        name = "Nagpur Style Cheese Pizza";
        sauce = "Chilly Sauce";
        dough = "Soft Dough";
    }

    public void LotsOfCheese() {
        System.out.println("Lots of Cheese were added");
    }

    public void recipe() {
        System.out.println("----  This is recipe of Nagpur Style Cheese Pizza. ---- ");
        System.out.println("Cheese \nDough \nChilly Sauce");
    }
}
