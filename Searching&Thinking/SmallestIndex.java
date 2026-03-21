package Searching;

import java.util.Scanner;

public class SmallestIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for (int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to count: ");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i<n; i++){
            if (arr[i]>x){
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println("Smallest index where arr[i]>X: "+index);
        else
            System.out.println("No element greater than X");
    }
}
