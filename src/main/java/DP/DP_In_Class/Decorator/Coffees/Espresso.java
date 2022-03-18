package DP.DP_In_Class.Decorator.Coffees;

public class Espresso extends Coffee {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return (description);
    }
}
