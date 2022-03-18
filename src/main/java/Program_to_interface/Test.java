package Program_to_interface;

public class Test {

  public static void main(String[] args) {
    Animal a1 = new Dog();
    Animal a2 = new Cat();

    Animal a3 = new Animal() {
      @Override
      public void makeSound() {
        System.out.println(
            "This is the general animal sound , lets consider it as a some kind of noise");
      }
    };

    //from the animal class
    a3.makeSound();
    a3.test_calling();

    //from the child class
    a1.makeSound();
    a1.test_calling();
    a2.makeSound();
  }
}
