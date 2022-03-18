package Interface;

public class Maharashtra implements Country, Bollywood {

  @Override
  public void motherToungue() {
    System.out.println("The mothertoungue of Maharashtra is Marathi");
  }

  @Override
  public void famousfruits() {
    System.out.println("The famous fruit of Maharashtra is Mango");
  }

  public static void main(String[] args) {
    Maharashtra mh = new Maharashtra();
    mh.motherToungue();
    mh.famousfruits();

    Country country = new Maharashtra();
    country.national_language();
    country = new Gujarat();
  }

  @Override
  public void have_bollywood() {
    System.out.println("Yeah Maharashtra has Bollywood");
  }
}
