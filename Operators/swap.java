package Operators;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no:");
        int a = sc.nextInt();
        System.out.println("enter second no:");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
