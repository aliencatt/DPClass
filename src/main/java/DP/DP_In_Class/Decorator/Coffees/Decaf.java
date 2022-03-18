package DP.DP_In_Class.Decorator.Coffees;

public class Decaf extends Coffee {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
