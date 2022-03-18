package Practice.Execption;

public class Execption {

  // so we are just praticing the execption handling

  //this is the parent class

  public void division_by_zero() throws ArithmeticException, NullPointerException {
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
  }

}

