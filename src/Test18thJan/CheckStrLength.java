package Test18thJan;

import java.util.Scanner;

public class CheckStrLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        if(s.length() >10)
            System.out.println("Given String is greater then 10 character");
        else
            System.out.println("Given String is less or equal to 10 character");
    }
}
