package DuckExample.Ducks;

import DuckExample.Duck;
import DuckExample.NoFly;
import DuckExample.SqueekSqueek;

public class RubberDuck extends Duck {

    @Override
    protected void display() {
        System.out.println("I am RubberDuck");
    }

    public RubberDuck() {
        System.out.println("Hello I am Rubber Duck");
        flyBehaviour = new NoFly();
        quackBehaviour = new SqueekSqueek();
    }

    public static void main(String[] args) {

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.setFlyBehaviour(new NoFly());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
    }
}
