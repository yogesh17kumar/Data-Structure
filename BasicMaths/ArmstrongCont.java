package BasicMath;

import java.util.Scanner;

public class ArmstrongCont {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int count = 0;

        for (int num = start; num <= end; num++) {

            int sum = 0;
            int digits = 0;
            int copy = num;

            // Step 1: Count digits
            while (copy > 0) {
                digits++;
                copy /= 10;
            }

            copy = num;

            // Step 2: Calculate sum of digit^digits
            while (copy > 0) {
                int digit = copy % 10;
                sum += Math.pow(digit, digits);
                copy /= 10;
            }

            if (sum == num) {
                count++;
            }
        }

        System.out.println("Total Armstrong Numbers: " + count);
    }
}