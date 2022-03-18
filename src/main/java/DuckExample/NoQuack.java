package DuckExample;

public class NoQuack implements QuackBehaviour {

  @Override
  public void quack() {
    System.out.println("I do not quack");
  }
}
