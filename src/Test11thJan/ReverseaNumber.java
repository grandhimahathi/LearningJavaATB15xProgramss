package Test11thJan;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no");
        int no = s.nextInt();
        int rev=0;
        do {
        int a=no % 10;
        rev= rev*10+a;
        no = no /10;
    } while ((no != 0));

            System.out.println("reverse no: " + rev);
            s.close();

}
}
