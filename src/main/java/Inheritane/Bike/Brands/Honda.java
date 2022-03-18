package Inheritane.Bike.Brands;

import Inheritane.Bike.Bike;
import Inheritane.Bike.Models.Shine;
import Inheritane.Bike.Models.Unicorn;

public class Honda {

  Shine shine;
  Unicorn unicorn;

  public Honda(Shine shine, Unicorn unicorn) {
    this.shine = shine;
    this.unicorn = unicorn;
  }

  public static Bike getHonda(String Bike_name) {
    if (Bike_name.toLowerCase() == "shine") {
      return new Shine();
    }
    if (Bike_name.toLowerCase() == "unicorn") {
      return new Unicorn();
    }
    return null;
  }
}
