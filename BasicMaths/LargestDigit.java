package BasicMath;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int max = 0;
        while(n>0){
            int digit = n%10;
            if (digit>max){
                max = digit;
            }
            n/=10;
        }
        System.out.println("Largest digit: "+max);
    }
}
