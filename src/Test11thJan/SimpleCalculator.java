package Test11thJan;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        System.out.println("Enter first no : ");
        double a = s.nextInt();
        System.out.println("Enter second no : ");
        double b = s.nextInt();

        System.out.println("choose option: ");
        System.out.println("1 Add ");
        System.out.println("2 Sub ");
        System.out.println("3 Mul ");
        System.out.println("4 Div ");

        System.out.println("Enter your choice (1-4): ");
        int choice= s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("result  = "+ (a+b));
                break;
            case 2:
                System.out.println("result =  "+ (a-b));
                break;
            case 3:
                System.out.println("result = " + (a*b));
                break;
            default:
                System.out.println("Invalid input ");

        }
        s.close();

    }
}
