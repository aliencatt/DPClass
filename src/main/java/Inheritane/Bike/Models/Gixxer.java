package Inheritane.Bike.Models;

import Inheritane.Bike.Bike;

public class Gixxer extends Bike {

  @Override
  public void details() {
    Bike.mileage = 30;
    Bike.cost = 106000;
    System.out.println("The mileage of Gixxer is : " + Bike.mileage);
    System.out.println("The cost of bike is : " + Bike.cost);

  }
}
