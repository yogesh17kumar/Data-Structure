package BasicArray;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        prefix[0]=arr[0];
        for (int i = 1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.print("Prefix sum array: ");
        for (int i = 0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
