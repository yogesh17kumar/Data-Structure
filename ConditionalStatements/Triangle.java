package ConditionalStatement;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side:");
        int a = sc.nextInt();
        System.out.println("enter second side:");
        int b = sc.nextInt();
        System.out.println("enter third side:");
        int c = sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("Valid Triangle");
        } else  {
            System.out.println("Invalid");
        }
    }
}
