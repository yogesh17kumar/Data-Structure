package Operators;

import java.util.Scanner;

public class root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();
        int square = n*n;
        int cube = n*n*n;
        System.out.println("Square:"+square);
        System.out.println("Cube:"+cube);
    }
}
