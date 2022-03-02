package DP.Tries.Factory.PizzaFactory.Pizzas.VegPizzas;

import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.Basic;
import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.Herbs_n_Spices;
import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.VegPizzaContents;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CheesePizza extends VegPizza {

  public CheesePizza() throws InterruptedException {
    receipe();

  }

  @Override
  public void receipe() throws InterruptedException {

    System.out.println();
    super.name = "Cheese";
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
    vegContents.add(Herbs_n_Spices.ROSEMARY.toString());
    vegContents.add(Herbs_n_Spices.OREGANO.toString());

    System.out.println("Your " + name + " pizza containts :" + " " + vegContents.stream()
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
    System.out.println();
    Thread.sleep(1000);
    super.greet();
  }
}
