package DP.Tries.Factory.PizzaFactory.PizzaStores;

import DP.Tries.Factory.PizzaFactory.PizzaFactories.PizzaFactory;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.NonVegPizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.Pizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.Selection;
import Inheritane.Pizza.Veg_Pizza;

public abstract class PizzaStore {

  public abstract void orderVegPizza() throws InterruptedException;

  public abstract void orderNonVegPizza() throws InterruptedException;

}
