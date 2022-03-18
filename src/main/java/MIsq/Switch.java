package MIsq;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String what = scan.nextLine();
        int first, second;
        first = scan.nextInt();
        second = scan.nextInt();
        int result;

        //switch statement
        switch (what) {
            case "add":
                result = first + second;
                break;
            case "sub":
                if (first > second) {
                    result = first - second;
                    System.out.println(result);

                } else {
                    result = second - first;
                }
                System.out.println(result);

                break;
            case "mult":
                result = first * second;
                System.out.println(result);

                break;
            case "div":
                result = first / second;
                System.out.println(result);
                break;
            default:
                System.out.println("The inputted number doesn't match to any of the predefined cases");
                break;
        }
    }
}
