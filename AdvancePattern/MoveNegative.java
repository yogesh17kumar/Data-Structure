package AdvancePattern;

import java.util.*;

public class MoveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while(left <= right) {
            if(arr[left] < 0) {
                left++;
            }
            else if(arr[right] >= 0) {
                right--;
            }
            else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Output result
        System.out.println("Array after moving negatives to left:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}