package DP.Tries.Factory.PizzaFactory.Pizzas;

public abstract class Pizza {

  protected String name;

  public abstract void receipe() throws InterruptedException;

  protected void receive() {
    System.out.println("We have received your order for " + name);
  }

  protected void bake() {
    System.out.println(
        "We are baking your " + name + " pizza in oven. Please wait for few minutes");
  }

  protected void cut() {
    System.out.println(
        "Your pizza is baked. We are cutting your " + name + " pizza into pieces. Please wait");
  }

  protected void pack() {
    System.out.println("Your " + name + " is ready. We are packing it in a delivery box ");
  }

  protected void greet() {
    System.out.println("Thank You! Visit Again.");
  }

}
