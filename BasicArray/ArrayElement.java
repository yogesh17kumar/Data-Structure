package BasicArray;

import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
