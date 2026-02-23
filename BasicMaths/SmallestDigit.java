package BasicMath;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int min = 9;
        while(n>0){
            int digit = n%10;
            if (digit<min){
                min = digit;
            }
            n/=10;
        }
        System.out.println("Smallest digit: "+min);
    }
}
