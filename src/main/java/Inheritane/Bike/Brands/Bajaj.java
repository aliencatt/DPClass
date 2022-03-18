package Inheritane.Bike.Brands;

import Inheritane.Bike.Bike;
import Inheritane.Bike.Models.Gixxer;
import Inheritane.Bike.Models.Pulsar;

public class Bajaj {

  Pulsar pulsar;
  Bike bike;

  public Bajaj(Bike bike) {
    this.bike = bike;
  }

  public Bajaj() {

  }

  public Bajaj(Pulsar pulsar) {
    this.pulsar = pulsar;
  }


  //factory method
  public static Bike getBajaj(String Bike_name) {
    if (Bike_name.toLowerCase() == "pulsar") {
      return new Gixxer();
    }
    return null;
  }

}
