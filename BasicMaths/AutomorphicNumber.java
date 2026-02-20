package BasicMath;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int square = n*n;
        int temp = 1;
        int digits = 0;
        while(temp>0){
            digits++;
            temp/=10;
        }
        int divisor = (int)Math.pow(10,digits);
        if(square%divisor==n){
            System.out.println("An automorphic number");
        } else {
            System.out.println("not an automorphic number");
        }
    }
}
