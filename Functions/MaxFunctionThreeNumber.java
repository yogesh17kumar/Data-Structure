package Functions;

import java.util.Scanner;

public class MaxFunctionThreeNumber {
    static int max(int a, int b, int c){
        if (a>=b&&a>=c)
            return a;
        else if (b>=a&&b>=c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int result = max(num1, num2, num3);
        System.out.println("Maximum: "+result);
    }
}

