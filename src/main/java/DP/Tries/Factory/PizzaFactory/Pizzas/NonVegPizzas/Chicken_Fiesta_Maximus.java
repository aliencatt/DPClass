package DP.Tries.Factory.PizzaFactory.Pizzas.NonVegPizzas;

import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.Basic;
import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.Herbs_n_Spices;
import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.NonVegPizzaContents;
import DP.Tries.Factory.PizzaFactory.Pizzas.Contents.VegPizzaContents;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Chicken_Fiesta_Maximus extends NonVegPizza {

  public Chicken_Fiesta_Maximus() throws InterruptedException {
    receipe();
  }

  @Override
  public void receipe() throws InterruptedException {

    System.out.println();
    super.name = "Chicken Fiesta Maximus";
    ArrayList<String> novegContents = new ArrayList<String>();
    for (Basic k : Basic.values()) {
      novegContents.add(k.toString());
    }
    novegContents.add(NonVegPizzaContents.CHICKEN.toString());
    novegContents.add(NonVegPizzaContents.GRILLED_CHICKEN_RASHERS.toString());
    novegContents.add(NonVegPizzaContents.CHICKEN_KEEMA.toString());
    novegContents.add(NonVegPizzaContents.CHICKEN_TIKKA.toString());
    novegContents.add(NonVegPizzaContents.CHICKEN_SAUSAGE.toString());
    novegContents.add(VegPizzaContents.BLACK_OLIVES.toString());
    novegContents.add(VegPizzaContents.CAPSICUM.toString());
    novegContents.add(VegPizzaContents.ONIONS.toString());
    novegContents.add(VegPizzaContents.TOMATOS.toString());
    novegContents.add(VegPizzaContents.JALAPENO.toString());
    novegContents.add(Herbs_n_Spices.GARLIC.toString());
    novegContents.add(Herbs_n_Spices.CORIANDER.toString());

    System.out.println("Your " + name + " pizza will contain :" + " " + novegContents.stream()
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
