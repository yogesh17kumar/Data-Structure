package SimulationLogicDevelopment;

import java.util.Scanner;

public class DigitSumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Logic
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }

            if (sum > 10) {
                count++;
            }
        }

        // Output
        System.out.println("Count = " + count);

        sc.close();
    }
}