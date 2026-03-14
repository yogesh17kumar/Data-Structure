package BasicArray;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of arrays: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i<n-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is Sorted");
        }else {
            System.out.println("Array is not Sorted");
        }
    }
}
