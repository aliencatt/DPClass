package DuckExample;

public abstract class Duck {

    protected abstract void display();

    public FlyBehaviour flyBehaviour;

    public QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    protected void swim() {
        System.out.println("I can swim");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }


}
