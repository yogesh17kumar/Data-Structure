package SimulationLogicDevelopment;

import java.util.Scanner;

public class IncreasingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int len = 1;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                len++;
            } else {
                count += (len * (len - 1)) / 2;
                len = 1;
            }
        }

        count += (len * (len - 1)) / 2;

        System.out.println("Increasing subarrays: " + count);
    }
}