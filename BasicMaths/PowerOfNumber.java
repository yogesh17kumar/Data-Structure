package BasicMath;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base: ");
        int base = sc.nextInt();
        System.out.println("enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1;i<=power;i++){
            result = result*base;
        }
        System.out.println("Result: "+result);
    }
}
