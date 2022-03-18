package DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas;

import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.Basic;
import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.VegPizzaContents;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Veg_Extravaganza extends VegPizza {

  public Veg_Extravaganza() throws InterruptedException {
    receipe();
  }

  public static void main(String[] args) throws InterruptedException {
    Veg_Extravaganza veg_extravaganza = new Veg_Extravaganza();
    veg_extravaganza.receipe();
  }

  @Override
  public void receipe() throws InterruptedException {

    //accessing the parent class variable using the super
    //final ArrayList<String> vegContents = super.VegContents;
    System.out.println();
    super.name = "Veg Extravaganza";
    ArrayList<String> vegContents = new ArrayList<String>();
    for (Basic k : Basic.values()) {
      vegContents.add(k.toString());
    }
    vegContents.add(VegPizzaContents.BLACK_OLIVES.toString());
    vegContents.add(VegPizzaContents.CAPSICUM.toString());
    vegContents.add(VegPizzaContents.ONIONS.toString());
    vegContents.add(VegPizzaContents.GRILLED_MUSHROOM.toString());
    vegContents.add(VegPizzaContents.CORN.toString());
    vegContents.add(VegPizzaContents.TOMATOS.toString());
    vegContents.add(VegPizzaContents.JALAPENO.toString());

    System.out.println("Your " + name + " pizza will contain :" + " " + vegContents.stream()
        .map(Object::toString)
        .collect(Collectors.joining(", ")));

    System.out.println();
    Thread.sleep(1000);
    super.bake();
    System.out.println();
    Thread.sleep(3000);
    super.cut();
    System.out.println();
    Thread.sleep(2000);
    super.pack();
    System.out.println();
    Thread.sleep(1000);
    super.greet();
  }
}
