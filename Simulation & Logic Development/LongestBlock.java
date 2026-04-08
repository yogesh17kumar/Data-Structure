package SimulationLogicDevelopment;

import java.util.Scanner;

public class LongestBlock {
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

        int maxLen = 1;
        int currLen = 1;

        // Logic
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
                currLen = 1;
            }
        }

        // Final check
        if (currLen > maxLen) {
            maxLen = currLen;
        }

        // Output
        System.out.println("Longest block length: " + maxLen);

        sc.close();
    }
}