package Inheritane.Bike.Models;

import Inheritane.Bike.Bike;

public class Pulsar extends Bike {

  @Override
  public void details() {
    Bike.mileage = 40;
    Bike.cost = 90000;
    System.out.println("The mileage of Pulsar is :" + Bike.mileage);
      System.out.println("The cost of the MIsq.Bike is : " + Bike.cost);
  }


}
