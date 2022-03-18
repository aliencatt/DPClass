package DP.Tries.Factory.PizzaFactory.PizzaFactories;

import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Dominator;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Fiesta;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Fiesta_Maximus;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Pepperoni;
import DP.Tries.Factory.PizzaFactory.Pizzas.Pizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.*;

public class NagpurPizzaFactory extends PizzaFactory {

  Pizza pizza;

  public NagpurPizzaFactory(Pizza pizza) {
    this.pizza = pizza;
  }

  public NagpurPizzaFactory() {
  }

  @Override
  public Pizza createVegPizza(int pizza) throws InterruptedException {

    if (pizza == 1) {
      return new CheesePizza();
    }
    if (pizza == 2) {
      return new CornPizza();
    }
    if (pizza == 3) {
      return new Margherita();
    }
    if (pizza == 4) {
      return new Mexican_Green_Wave();
    }
    if (pizza == 5) {
      return new Veg_Extravaganza();
    }
    return null;
  }

  @Override
  public Pizza createNonVegPizza(int pizza) throws InterruptedException {

    if (pizza == 1) {
      return new Chicken_Dominator();
    }
    if (pizza == 2) {
      return new Chicken_Fiesta();
    }
    if (pizza == 3) {
      return new Chicken_Fiesta_Maximus();
    }
    if (pizza == 4) {
      return new Chicken_Pepperoni();
    }

    return null;

  }

  @Override
  public Pizza createNonVegPizza(int[] pizza) throws InterruptedException {
    //use the swiitch statement for providing more than 1 pizza
    return null;
  }

  @Override
  public Pizza createVegPizza(int[] pizza) throws InterruptedException {
    return null;
  }
}
