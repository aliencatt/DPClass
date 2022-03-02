package DP.Tries.Factory.PizzaFactory.Pizzas;

import DP.Tries.Factory.PizzaFactory.PizzaFactories.NagpurPizzaFactory;
import DP.Tries.Factory.PizzaFactory.PizzaFactories.PizzaFactory;
import DP.Tries.Factory.PizzaFactory.PizzaStores.BardiPizzaStore;
import DP.Tries.Factory.PizzaFactory.PizzaStores.ItwariPizzaStore;
import DP.Tries.Factory.PizzaFactory.PizzaStores.PizzaStore;
import DP.Tries.Factory.PizzaFactory.PizzaStores.ShankarNagarPizzaStore;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.CheesePizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.VegPizza;
import Inheritane.Pizza.Veg_Pizza;
import java.util.HashMap;
import java.util.Map;

public class Selection {

  public Map<Integer, String> pizzastore;
  public Map<Integer, String> pizzaFactori;
  Map<Integer, String> veg_nonveg;
  Map<Integer, String> vegPizza;
  Map<Integer, String> nonVegPizza;
  PizzaStore pizzastores;
  int store;
  int vegornonveg;
  int vegpizza;
  int nonvegpizza;
  PizzaFactory pizzaFactory;

  public Selection(PizzaStore pizzastores) {
    this.pizzastores = pizzastores;
  }

  public Selection() {

  }

  public int getVegornonveg() {
    return vegornonveg;
  }

  public void setVegornonveg(int vegornonveg) {
    this.vegornonveg = vegornonveg;
  }

  public int getVegpizza() {
    return vegpizza;
  }

  public void setVegpizza(int vegpizza) {
    this.vegpizza = vegpizza;
  }

  public int getNonvegpizza() {
    return nonvegpizza;
  }

  public void setNonvegpizza(int nonvegpizza) {
    this.nonvegpizza = nonvegpizza;
  }

  public void selectstore() {
    pizzastore = new HashMap<Integer, String>();
    pizzastore.put(1, "Bardi Pizza Store");
    pizzastore.put(2, "Itwari Pizza Store");
    pizzastore.put(3, "Shankar Nagar Pizza Store");

    pizzastore.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " " + entry.getValue());
    });
  }

  public void selectveg_nonveg() {
    veg_nonveg = new HashMap<Integer, String>();
    veg_nonveg.put(1, "Veg Pizza");
    veg_nonveg.put(2, "Non Veg Pizza");

    veg_nonveg.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " " + entry.getValue());
    });
  }

  public void selectvegPizza() {
    vegPizza = new HashMap<Integer, String>();
    vegPizza.put(1, "Cheese Pizza");
    vegPizza.put(2, "Corn Pizza");
    vegPizza.put(3, "Margherita Pizza");
    vegPizza.put(4, "Mexican Green Wave Pizza");
    vegPizza.put(5, "Veg Extravaganza Pizza");

    vegPizza.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " " + entry.getValue());
    });
  }

  public void selectnonvegPizza() {
    nonVegPizza = new HashMap<Integer, String>();
    nonVegPizza.put(1, "Chiken Dominator Pizza");
    nonVegPizza.put(2, "Chicken Fiesta Pizza");
    nonVegPizza.put(3, "Chiken Fiesta Maximus Pizza");
    nonVegPizza.put(4, "Chicken Pepperoni Pizza");

    nonVegPizza.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " " + entry.getValue());
    });
  }

  public void selectPizzaFactory() {
    pizzaFactori = new HashMap<Integer, String>();
    pizzaFactori.put(1, "Nagpur Factory");
    pizzaFactori.put(2, "Mumbai Factory");
    pizzaFactori.put(3, "Pune Factory");
    pizzaFactori.put(4, "Nashik Factory");

    pizzaFactori.entrySet().forEach(entry -> {
      System.out.println(entry.getKey() + " " + entry.getValue());
    });
  }


  public void checkStore(int a) throws IllegalInputException {
    if (a < 1 || a > 3) {
      throw new IllegalInputException(
          "The entered value is invalid. Please enter the value between 1 and 3");
    }
  }

  public void checkVegNonVeg(int a) throws IllegalInputException {
    if (a < 1 || a > 2) {
      throw new IllegalInputException(
          "The entered value is invalid. Please enter the value between 1 and 2");
    }
  }

  public void checkVegPizza(int a) throws IllegalInputException {
    if (a < 1 || a > 5) {
      throw new IllegalInputException(
          "The entered value is invalid. Please enter the value between 1 and 5");
    }
  }

  public void checkNonVegPizza(int a) throws IllegalInputException {
    if (a < 1 || a > 4) {
      throw new IllegalInputException(
          "The entered value is invalid. Please enter the value between 1 and 4");
    }
  }

  public void checkFactory(int a) throws IllegalInputException {
    if (a < 1 || a > 4) {
      throw new IllegalInputException(
          "The entered value is invalid. Please enter the value between 1 and 4");
    }
  }


  public int getStore() {
    return store;
  }

  public void setStore(int store) {
    this.store = store;
  }

//  public int selectedStore() {
//    if (this.getStore() == 1) {
//      return 1;
//    }
//    if (this.getStore() == 2) {
//      return 2;
//    }
//    if (this.getStore() == 3) {
//      return 3;
//    }
//    return 0;
//  }

  public void getMyVegPizza(int a) throws InterruptedException {
    PizzaFactory pf = new NagpurPizzaFactory();
    Pizza pv = new NagpurPizzaFactory().createVegPizza(getVegpizza());

    if (a == 1) {
      new BardiPizzaStore(pf);
    }
    if (a == 2) {
      new ItwariPizzaStore(pf);
    }
    if (a == 3) {
      new ShankarNagarPizzaStore(pf);
    }

  }

  public void getMyNonvegPizza(int store_number) throws InterruptedException {
    PizzaFactory pf = new NagpurPizzaFactory();
    Pizza pn = new NagpurPizzaFactory().createNonVegPizza(getNonvegpizza());

    if (store_number == 1) {
      new BardiPizzaStore(pf);
    }
    if (store_number == 2) {
      new ItwariPizzaStore(pf);
    }
    if (store_number == 3) {
      new ShankarNagarPizzaStore(pf);
    }
  }
}

