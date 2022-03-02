package DP.Tries.Factory.PizzaFactory.PizzaFactories;

import DP.Tries.Factory.PizzaFactory.Pizzas.Pizza;

public abstract class PizzaFactory {

  //Factory methods
  public abstract Pizza createVegPizza(int pizza) throws InterruptedException;

  public abstract Pizza createNonVegPizza(int pizza) throws InterruptedException;

  public abstract Pizza createNonVegPizza(int[] pizza) throws InterruptedException;

  public abstract Pizza createVegPizza(int[] pizza) throws InterruptedException;


}

// pizza factory will give the pizza needed according to the passsed number