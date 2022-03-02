package DP.Tries.Factory.PizzaFactory.PizzaStores;

import DP.Tries.Factory.PizzaFactory.PizzaFactories.PizzaFactory;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Dominator;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Fiesta;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Fiesta_Maximus;
import DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas.Chicken_Pepperoni;
import DP.Tries.Factory.PizzaFactory.Pizzas.Pizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.Selection;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.CheesePizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.CornPizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.Margherita;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.Mexican_Green_Wave;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.Veg_Extravaganza;

public class ItwariPizzaStore extends PizzaStore {

  PizzaFactory pizzaFactory;
  Selection selection;
  Pizza pizza;

  public ItwariPizzaStore(PizzaFactory pizzaFactory) {
    this.pizzaFactory = pizzaFactory;
  }

  public ItwariPizzaStore() {
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
