package BasicMath;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no : ");
        int a = sc.nextInt();
        System.out.println("enter sec no : ");
        int b = sc.nextInt();
        int gcd = 1;
        int min = Math.min(a, b);
        for (int i = 1; i<=min; i++){
            if (a%i==0&&b%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD: "+gcd);
    }
}
