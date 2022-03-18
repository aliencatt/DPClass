package DP.DP_In_Class.Singleton;

public class Demo {

    public static void main(String[] args) {

        Principal principal = Principal.getPrincipal();
        System.out.println(principal.hashCode());

        principal.givePersmission();
        principal.frameRules();

        Principal principal2 = Principal.getPrincipal();
        System.out.println(principal2.hashCode());


    }

}
