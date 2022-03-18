package Inheritane.Pizza;

public class Veg_Pizza extends Pizza {

  @Override
  public void bake() {
    super.bake();
  }

  @Override
  public void cut() {
    super.cut();
  }

  @Override
  public void pack() {
    super.pack();
  }

  public void lotsofVegetables() {
    System.out.println("Adding lots of vegetables");
  }
}
