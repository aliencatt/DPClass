package DuckExample.Ducks;

import DuckExample.Duck;
import DuckExample.NoFly;
import DuckExample.NoQuack;

public class WoodenDuck extends Duck {

  @Override
  protected void display() {
    System.out.println("I am WoodenDuck");
  }

  public WoodenDuck() {
    System.out.println("Hello I am Wooden Duck");
    flyBehaviour = new NoFly();
    quackBehaviour = new NoQuack();
  }

  public static void main(String[] args) {
    WoodenDuck woodenDuck = new WoodenDuck();
    woodenDuck.display();
    woodenDuck.performFly();
    woodenDuck.performQuack();
    woodenDuck.swim();
  }
}
