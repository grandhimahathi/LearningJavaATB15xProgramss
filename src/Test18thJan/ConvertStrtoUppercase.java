package Test18thJan;

import java.util.Scanner;

public class ConvertStrtoUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toUpperCase();

        System.out.println("Upper case Converted:"+ input);


    }
}
