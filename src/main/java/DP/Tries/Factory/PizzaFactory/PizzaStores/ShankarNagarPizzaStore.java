package DP.Tries.Factory.PizzaFactory.PizzaStores;

import DP.Tries.Factory.PizzaFactory.PizzaFactories.PizzaFactory;
import DP.Tries.Factory.PizzaFactory.Pizzas.Pizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.Selection;

public class ShankarNagarPizzaStore extends PizzaStore {

  PizzaFactory pizzaFactory;
  Selection selection;
  Pizza pizza;

  public ShankarNagarPizzaStore(PizzaFactory pizzaFactory) {
    this.pizzaFactory = pizzaFactory;
  }

  public ShankarNagarPizzaStore() {
  }

  @Override
  public void orderVegPizza() throws InterruptedException {
    this.pizza = pizzaFactory.createVegPizza(selection.getVegpizza());
  }

  @Override
  public void orderNonVegPizza() throws InterruptedException {
    this.pizza = pizzaFactory.createNonVegPizza(selection.getNonvegpizza());
  }

}
