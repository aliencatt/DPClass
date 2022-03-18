package Inheritane.Bike.Models;

import Inheritane.Bike.Bike;

public class Hayabusa extends Bike {

  @Override
  public void details() {
    Bike.mileage = 70;
    Bike.cost = 100000;
    System.out.println("The mileage of Pulsar is :" + Bike.mileage);
      System.out.println("The cost of the MIsq.Bike is : " + Bike.cost);
  }
}
