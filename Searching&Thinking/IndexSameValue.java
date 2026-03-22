package Searching;

import java.util.Scanner;

public class IndexSameValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0, high = n - 1;
        int index = -1;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==mid){
                index = mid;
                break;
            } else if (arr[mid]<mid) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        if (index!=-1)
            System.out.println("Index where arr[i]==i: "+index);
        else
            System.out.println("No such index found");
    }
}