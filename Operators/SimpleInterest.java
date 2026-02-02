package Operators;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal:");
        double p = sc.nextDouble();
        System.out.println("enter rate:");
        double r = sc.nextDouble();
        System.out.println("enter time:");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Interest:"+si);
    }
}
