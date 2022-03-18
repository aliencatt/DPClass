package DP.Tries.Factory.PizzaFactory.PizzaStores;

public abstract class PizzaStore {

  public abstract void orderVegPizza() throws InterruptedException;

  public abstract void orderNonVegPizza() throws InterruptedException;

}
