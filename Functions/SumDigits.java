package Functions;

import java.util.Scanner;

public class SumDigits {
    static int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = sumOfDigits(number);
        System.out.println("Sum of Digits: "+result);
    }
}
