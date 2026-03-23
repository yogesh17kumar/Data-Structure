package Searching;

import java.util.Scanner;

public class CountPeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // check first element
        if(n > 1 && arr[0] > arr[1]) {
            count++;
        }

        // check middle elements
        for(int i = 1; i < n - 1; i++) {
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                count++;
            }
        }

        // check last element
        if(n > 1 && arr[n - 1] > arr[n - 2]) {
            count++;
        }

        System.out.println("Number of peaks: " + count);
    }
}