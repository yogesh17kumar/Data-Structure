package ConditionalStatement;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a = sc.nextInt();
        System.out.println("Enter Second side:");
        int b = sc.nextInt();
        System.out.println("Enter Third side:");
        int c = sc.nextInt();
        if (a+b>c&&a+c>b&&b+c>a){
            if(a==b&&b==c){
                System.out.println("Equilateral triangle");
            } else if (a==b||b==c||a==c) {
                System.out.println("Isosceles triangle");
            }else{
                System.out.println("Scalene triangle");
            }
        }else{
            System.out.println("Not a valid Triangle");
        }
    }
}
