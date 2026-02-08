package ConditionalStatement;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("greater is:"+a);
        } else if (b>a) {
            System.out.println("greater is:"+b);
        }else{
            System.out.println("both equal");
        }
    }
}
