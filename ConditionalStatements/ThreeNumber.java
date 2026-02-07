package ConditionalStatement;

import java.util.Scanner;

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first no:");
        int a = sc.nextInt();
        System.out.println("enter second no:");
        int b = sc.nextInt();
        System.out.println("enter third no:");
        int c = sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println("greatest is:"+a);
        } else if (b>=a&&b>=c) {
            System.out.println("greatest is:"+b);
        }else{
            System.out.println("greatest is:"+c);
        }
    }
}
