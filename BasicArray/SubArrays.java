package BasicArray;

import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("All Subarrays:");

        for(int i = 0; i < n; i++) {          // starting index
            for(int j = i; j < n; j++) {      // ending index
                for(int k = i; k <= j; k++) { // print elements
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}