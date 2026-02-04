package ConditionalStatement;

import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Yes divisible by 5");

        }else{
            System.out.println("No, Not Divisible by 5");
        }
    }
}
