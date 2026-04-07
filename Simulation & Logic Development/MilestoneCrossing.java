package SimulationLogicDevelopment;

import java.util.Scanner;

public class MilestoneCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int sum = 0;
        int count = 0;

        // Logic
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > k) {
                count++;
            }
        }

        // Output
        System.out.println("Milestone crossings: " + count);

        sc.close();
    }
}