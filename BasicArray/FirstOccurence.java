package BasicArray;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i<n; i++){
            if (arr[i]==x){
                index=i;
                break;
            }
        }
        if (index!=-1){
            System.out.println("First element Occurence: "+index);
        }else{
            System.out.println("Element Not Found");
        }
    }
}
