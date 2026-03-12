package BasicArray;

import java.util.Scanner;

public class DistinctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of arrays: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i<n; i++){
            boolean isDistinct = true;
            for (int j = 0; j<i; j++){
                if (arr[i]==arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct){
                count++;
            }
        }
        System.out.println("Total distinct elements: "+count);
    }
}
