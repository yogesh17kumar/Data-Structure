package ConditionalStatement;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n%3==0&&n%5==0){
            System.out.println("Yes divisible by both");

        }else{
            System.out.println("No, Not divisible");
        }
    }
}
