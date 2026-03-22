package Searching;

import java.util.Scanner;

public class GreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        int low = 0, high = n - 1;
        int index = n;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] > x) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int count = n - index;

        System.out.println("Count of elements > X: " + count);
    }
}