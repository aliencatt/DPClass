package DP.DP_In_Class.Factory.Remake;

public class PizzaDemo {
    public static void main(String args[]) {

        PizzaStore ps;
        ps = new MumbaiPizzaStore();
        ps.orderPizza("Mumbai Style Cheese Pizza");
        ps.orderPizza("Mumbai Style Corn Pizza");
        ps.orderPizza("Mumbai Style Veg Pizza");

        System.out.println("\n");

        ps = new NagpurPizzaStore();
        ps.orderPizza("Nagpur Style Corn Pizza");
        ps.orderPizza("Nagpur style veg pizza");
        ps.orderPizza("Nagpur style Cheese pizza");
    }
}
