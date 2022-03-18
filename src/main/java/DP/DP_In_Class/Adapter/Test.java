package DP.DP_In_Class.Adapter;

public class Test {
    public static void main(String[] args) {

        Turkey t = new WildTurkey();
        Duck d = new TurkeyAdapter(t);
        TestDuck(d);


    }

    static public void TestDuck(Duck d) {
        d.fly();
        System.out.println();
        d.quack();
    }
}

