package BasicMath;

import java.util.Scanner;

public class ArmstrongPrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers in range:");

        for (int num = start; num <= end; num++) {

            int sum = 0;
            int digits = 0;
            int copy = num;

            // Count digits
            while (copy > 0) {
                digits++;
                copy /= 10;
            }

            copy = num;

            // Calculate sum of digit^digits
            while (copy > 0) {
                int digit = copy % 10;
                sum += (int) Math.pow(digit, digits);
                copy /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

    }
}