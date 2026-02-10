package Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int lcm = (a>b)? a:b;//Math.max() ise bhi replace kr skte h

        while(true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM=" + lcm);
                break;
            }
            lcm++;
        }
    }
}
