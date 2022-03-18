package Inheritane.Bike.Brands;

import Inheritane.Bike.Bike;
import Inheritane.Bike.Models.Gixxer;
import Inheritane.Bike.Models.Hayabusa;

public class Suzuki {

  Gixxer Gixxer;
  Hayabusa hayabusa;

  public Suzuki(Inheritane.Bike.Models.Gixxer gixxer, Hayabusa hayabusa) {
    Gixxer = gixxer;
    this.hayabusa = hayabusa;
  }

  //factory Method

  public static Bike getSuzuki(String Bike_name) {
    if (Bike_name.toLowerCase() == "gixxer") {
      return new Gixxer();
    }
    if (Bike_name.toLowerCase() == "hayabusa") {
      return new Hayabusa();
    }
    return null;
  }

}
