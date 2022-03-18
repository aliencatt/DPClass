package DP.DP_In_Class.Prototype;


public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        AngryBird a1 = new AngryBird();
        a1.setData();
        a1.displayData();
        System.out.println(a1.hashCode());

        try {

            AngryBird a2 = (AngryBird) a1.clone();
            a2.setColor("Yellow");
            a2.displayData();
            System.out.println("____________________________________");
            a1.displayData();
            System.out.println(a2.hashCode());
            AngryBird a3 = (AngryBird) a1.clone();
            System.out.println(a3.hashCode());
            AngryBird a4 = (AngryBird) a1.clone();
            System.out.println(a4.hashCode());
            AngryBird a5 = (AngryBird) a1.clone();
            System.out.println(a5.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}

