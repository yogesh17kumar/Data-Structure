package Searching;

import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;

                // skip all same elements
                while(i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }

        System.out.println("Elements appearing more than once: " + count);
    }
}