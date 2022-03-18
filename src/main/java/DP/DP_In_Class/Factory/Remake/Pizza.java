package DP.DP_In_Class.Factory.Remake;

public abstract class Pizza {
    String name;
    String sauce;
    String dough;

    abstract public void recipe();

    public void bake() {
        System.out.println("Pizza is being baked.");
    }

    public void cut() {
        System.out.println("Pizza is cut into pieces ");
    }

    public void pack() {
        System.out.println("Pizza is packed.");
    }
}
