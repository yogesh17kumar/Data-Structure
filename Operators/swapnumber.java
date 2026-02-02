package Operators;

import java.util.Scanner;

public class swapnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no:");
        int a = sc.nextInt();
        System.out.println("enter second no:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
