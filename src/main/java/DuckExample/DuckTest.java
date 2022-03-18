package DuckExample;

import DuckExample.Ducks.MallardDuck;
import DuckExample.Ducks.RedHeadDuck;
import DuckExample.Ducks.RubberDuck;
import DuckExample.Ducks.WoodenDuck;

public class DuckTest {

    public static void main(String[] args) {

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();

        System.out.println();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.setFlyBehaviour(new Fly_At_Less_Height());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        System.out.println();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.swim();

    }
}
