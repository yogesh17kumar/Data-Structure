package Searching;

import java.util.Scanner;

public class CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Duplicates exists");
        else
            System.out.println("No duplicates");
    }
}