package AdvancePattern;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input sorted array
        System.out.println("Enter sorted elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Edge case
        if(n == 0) {
            System.out.println("Array is empty");
            return;
        }

        int i = 0; // pointer for unique elements

        for(int j = 1; j < n; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // New length = i + 1
        System.out.println("Array after removing duplicates:");
        for(int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}