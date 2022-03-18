package DP.DP_In_Class.AbstractFactory;

public class PizzaDemo {

    public static void main(String args[]) {

        PizzaStore ps;
        ps = new NagpurPizzaStore();
        ps.orderPizza("Cheese Pizza");
        System.out.println();
        ps.orderPizza("Corn Pizza");
    }
}