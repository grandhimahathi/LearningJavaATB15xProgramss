package Test11thJan;

import java.util.Scanner;

public class MaxTwoNos {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        System.out.println("Enter first no");
        int n = s.nextInt();
        System.out.println("Enter second no");
        int n1 = s.nextInt();
        int max = (n > n1) ? n : n1 ;
        System.out.println("Max Number is :" + max);
        s.close();
    }
}
