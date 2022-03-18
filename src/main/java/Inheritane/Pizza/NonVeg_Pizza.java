package Inheritane.Pizza;

public class NonVeg_Pizza extends Pizza {

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

  public void addSomeNonVedIngredients() {
    System.out.println("Let's pretend that some non-veg ingredients were added");
  }


}
