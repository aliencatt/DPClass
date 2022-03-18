package Program_to_interface;

public class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("The dog make the bho-bho sound");
  }

  @Override
  protected void test_calling() {
    System.out.println("From the child");
  }
}
