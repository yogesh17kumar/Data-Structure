package Operators;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int n = sc.nextInt();
        int lastdigit = n%10;
        System.out.println("Last Digit:"+lastdigit);
    }
}
