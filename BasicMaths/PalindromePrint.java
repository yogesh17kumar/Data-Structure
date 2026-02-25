package BasicMath;

import java.util.Scanner;

public class PalindromePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start : ");
        int start = sc.nextInt();
        System.out.print("enter end : ");
        int end = sc.nextInt();
        System.out.println("Palindrome numbers in range:");
        for (int num = start; num<=end; num++){
            int original = num;
            int rev = 0;
            int temp = num;

            while(temp>0){
                rev = rev*10+temp%10;
                temp/=10;
            }
            if (original==rev){
                System.out.print(num+" ");
            }
        }
    }
}
