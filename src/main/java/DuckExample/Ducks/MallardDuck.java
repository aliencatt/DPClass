package DuckExample.Ducks;

import DuckExample.Duck;
import DuckExample.Fly_At_Less_Height;
import DuckExample.QuackQuack;

public class MallardDuck extends Duck {

    @Override
    protected void display() {
        System.out.println("I am Mallard Duck");
    }

    public MallardDuck() {
        System.out.println("Hello I am Mallardv Duck");
        flyBehaviour = new Fly_At_Less_Height();
        quackBehaviour = new QuackQuack();
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

    }
}
