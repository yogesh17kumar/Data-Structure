package Operators;

import java.util.Scanner;

public class Reaminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no:");
        int a = sc.nextInt();
        System.out.println("enter second no:");
        int b = sc.nextInt();
        double remainder = a%b;
        System.out.println("Remainder:"+remainder);
    }
}
