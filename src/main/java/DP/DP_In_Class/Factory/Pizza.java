package DP.DP_In_Class.Factory;

public abstract class Pizza {

  String name;
  String sauce;
  String dough;

  abstract void receipe();

  public void bake() {
    System.out.println("Pizza baked");
  }

  public void cut() {
    System.out.println("Pizza cut into pieces");
  }

  public void pack() {
    System.out.println("Pizza is packed");
  }


}
