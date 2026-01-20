package Test18thJan;

import java.util.Scanner;

public class CountcharinStr {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = s.nextLine();
        int count = 0;
        for (int i =1; i < input.length(); i++)
        {
            if (input != " "){
                count++;
            }
        } System.out.println("Total number of character:" + count);
    }
}
