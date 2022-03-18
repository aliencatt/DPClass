package DP.DP_In_Class.Decorator.Coffees;

public class DarkRoast extends Coffee {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
