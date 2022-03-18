package Interface;

public class Gujarat implements Country {

  @Override
  public void national_language() {
    Country.super.national_language();
  }

  @Override
  public void motherToungue() {
    System.out.println("The motherToungue of Gujrat is Gujrati");
  }

  @Override
  public void famousfruits() {
    System.out.println("The famous fruit of Gujrat is Banana");
  }
}
