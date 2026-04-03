package SimulationLogicDevelopment;

import java.util.Scanner;

public class Digit7 {
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

        // Output header
        System.out.println("Numbers containing 7 are:");

        // Logic
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            while (num > 0) {
                int digit = num % 10;

                if (digit == 7) {
                    System.out.println(arr[i]);
                    break; // ek baar mil gaya to next number pe jao
                }

                num = num / 10;
            }
        }

        sc.close();
    }
}