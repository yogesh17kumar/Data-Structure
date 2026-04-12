package BitManipulation;

import java.util.*;

public class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input K
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        int left = 0, sum = 0, maxLen = 0;

        for(int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink window if sum > K
            while(sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Update max length
            if(sum <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println("Longest subarray length: " + maxLen);
        sc.close();
    }
}