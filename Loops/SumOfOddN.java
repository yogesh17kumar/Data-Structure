package Loops;

import java.util.Scanner;

public class SumOfOddN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 1;

        while (count<n){
            sum = sum+i;
            i  = i+2;
            count++;
        }
        System.out.println("Sum:"+sum);
    }
}

