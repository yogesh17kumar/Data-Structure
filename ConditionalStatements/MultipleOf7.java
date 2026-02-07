package ConditionalStatement;

import java.util.Scanner;

public class MultipleOf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if(n%7==0){
            System.out.println("Multiple of 7");
        }else{
            System.out.println("Not multiple of 7");
        }
    }
}
