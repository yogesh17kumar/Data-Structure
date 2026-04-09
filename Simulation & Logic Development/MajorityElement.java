package SimulationLogicDevelopment;

import java.util.Scanner;

public class MajorityElement {
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

        // Step 1: Find candidate
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }

        sc.close();
    }
}