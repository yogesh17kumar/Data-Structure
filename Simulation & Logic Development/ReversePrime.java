package SimulationLogicDevelopment;

import java.util.Scanner;

public class ReversePrime {
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

        System.out.println("Numbers whose reverse is prime:");

        // Logic
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int rev = 0;
            int temp = num;

            // Reverse number
            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            // Check prime
            boolean isPrime = true;

            if (rev <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= rev / 2; j++) {
                    if (rev % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Print if condition satisfied
            if (isPrime) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}