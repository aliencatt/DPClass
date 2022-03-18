package Inheritane.Pizza;

public class Pizza_Runner {

  public static void main(String[] args) {

    //from the parent object and reference
    Pizza pizza = new Pizza();
    pizza.pack();
    pizza.cut();
    pizza.pack();

    //from the child object and parent reference
    Pizza p1 = new Veg_Pizza();
    p1.bake();
    p1.cut();
    p1.pack();

    //from the child object and child reference
    Veg_Pizza v1 = new Veg_Pizza();
    v1.bake();
    v1.lotsofVegetables();
    v1.cut();
    v1.pack();

    NonVeg_Pizza nonVed_pizza = new NonVeg_Pizza();
    Pizza p2 = new NonVeg_Pizza();

  }
}
