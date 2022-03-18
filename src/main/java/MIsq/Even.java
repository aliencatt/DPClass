package MIsq;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        // b=scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("The inputted number is even");
        } else {
            System.out.println("The inputted number is odd");
        }

    }
}
