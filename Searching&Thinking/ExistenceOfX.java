package Searching;

import java.util.Scanner;

public class ExistenceOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        int low = 0, high=n-1;
        boolean found = false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                found = true;
                break;
            } else if (arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        if (found)
            System.out.println("Element exists in array");
        else
            System.out.println("Element does not exit");
    }
}
