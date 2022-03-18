package Inheritane.Bike.Models;

import Inheritane.Bike.Bike;

public class Shine extends Bike {

  @Override
  public void details() {
    Bike.mileage = 50;
    Bike.cost = 85000;
    System.out.println("The mileage of Shine is : " + Bike.mileage);
    System.out.println("The cost of bike is : " + Bike.cost);
  }
}
