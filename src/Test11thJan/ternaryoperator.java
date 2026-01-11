package Test11thJan;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args){
        Scanner s = new Scanner((System.in));
        System.out.println("Enter a no");
        int n = s.nextInt();
        String result = (n>0)? "Positive" : (n<0) ? " Negative" : "Zero";
        System.out.println("Number:" + n);
        System.out.println("Result:" + result);

    }
}
