package Operators;

import java.util.Scanner;

class dmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no:");
        int a = sc.nextInt();
        System.out.println("enter second no:");
        int b = sc.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Substraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));

    }
}
