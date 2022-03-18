package DuckExample;

public class NoFly implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I do not fly");
  }
}
