package DP.Tries.Factory.PizzaFactory;

import DP.Tries.Factory.PizzaFactory.PizzaStores.BardiPizzaStore;
import DP.Tries.Factory.PizzaFactory.PizzaStores.PizzaStore;
import DP.Tries.Factory.PizzaFactory.Pizzas.IllegalInputException;
import DP.Tries.Factory.PizzaFactory.Pizzas.Pizza;
import DP.Tries.Factory.PizzaFactory.Pizzas.Selection;
import DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas.CheesePizza;
import java.io.PipedOutputStream;
import java.util.Scanner;

public class PizzaTest {


  public static void main(String[] args) throws InterruptedException {

    System.out.println();
    System.out.println("Welcome to Pizza Store");
    System.out.println();
    System.out.println("Select the Store from the list");

    System.out.println();
    Selection select = new Selection();
    Scanner scan = new Scanner(System.in);

    select.selectstore();
    int store_number = scan.nextInt();
    try {
      select.checkStore(store_number);
    } catch (IllegalInputException e) {
      System.out.println("OOPs! IllegalInputException occured");
      e.printStackTrace();
      System.exit(1);
    }
    if (store_number == 1) {
      System.out.println("\nWelcome to " + select.pizzastore.get(1));
    }
    if (store_number == 2) {
      System.out.println("\nWelcome to " + select.pizzastore.get(2));
    }
    if (store_number == 3) {
      System.out.println("\nWelcome to " + select.pizzastore.get(3));
    }
    select.setStore(store_number);

    //Select Factory
    System.out.println();
    System.out.println("Select for factory according to taste");
    System.out.println();
    System.out.println("Nagpur : Spicy");
    System.out.println("Mumbai : Light Spicy");
    System.out.println("Pune   : Middim Spicy");
    System.out.println("Nashik : Very Spicy");
    System.out.println();
    select.selectPizzaFactory();
    int factory_number = scan.nextInt();
    try {
      select.checkFactory(factory_number);
    } catch (IllegalInputException e) {
      System.out.println("OOPs! IllegalInputException occured");
      e.printStackTrace();
      System.exit(1);
    }
    if (factory_number == 1) {
      System.out.println("You have chosen " + select.pizzaFactori.get(1));
    }
    if (factory_number == 2) {
      System.out.println("You have chosen " + select.pizzaFactori.get(2));
    }
    if (factory_number == 3) {
      System.out.println("You have chosen " + select.pizzaFactori.get(3));
    }
    if (factory_number == 4) {
      System.out.println("You have chosen " + select.pizzaFactori.get(4));
    }
//    select.setStore(store_number);

    System.out.println("Will you like to have Veg pizza or Nonveg pizza");
    System.out.println();
    select.selectveg_nonveg();
    int vegnonveg = scan.nextInt();
    try {
      select.checkVegNonVeg(vegnonveg);
    } catch (IllegalInputException e) {
      System.out.println("OOPs! Execption occured");
      e.printStackTrace();
      System.exit(1);
    }
    select.setVegornonveg(vegnonveg);

    if (vegnonveg == 1) {

      System.out.println("Nice, you selected for Veg Pizza");
      System.out.println();
      select.selectvegPizza();
      int whichvegpizza = scan.nextInt();
      try {
        select.checkVegPizza(whichvegpizza);
      } catch (IllegalInputException e) {
        System.out.println("OOPs! Execption occured");
        e.printStackTrace();
        System.exit(1);
      }
      select.setVegpizza(whichvegpizza);
      select.getMyVegPizza(store_number);
    } else if (vegnonveg == 2) {
      System.out.println("Nice, you selected for NonVeg Pizza");
      System.out.println();
      select.selectnonvegPizza();
      int whichnonvegPizza = scan.nextInt();
      try {
        select.checkNonVegPizza(whichnonvegPizza);
      } catch (IllegalInputException e) {
        System.out.println("OOPs! Execption occured");
        e.printStackTrace();
        System.exit(1);
      }
      select.setNonvegpizza(whichnonvegPizza);
      select.getMyNonvegPizza(store_number);

    }

  }

}
//so there should have a method in the test class that takes the pizza reference that referencing to the implementing child pizza class
// also we are using the factory method so it will create the object
// but here we want that object to be created according to the number