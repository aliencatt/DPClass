package Interface;

public interface Country {

  default void national_language() {
    System.out.println("The national language of the country is hindi");
  }

  public void motherToungue();

  public void famousfruits();

}
