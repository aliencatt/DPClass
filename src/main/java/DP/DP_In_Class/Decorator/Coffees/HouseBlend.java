package DP.DP_In_Class.Decorator.Coffees;

public class HouseBlend extends Coffee {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
