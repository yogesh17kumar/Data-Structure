package Operators;

import java.util.Scanner;

public class RemoveDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        int n = sc.nextInt();
        int result = n/10;
        System.out.println("Result:"+result);
    }
}
