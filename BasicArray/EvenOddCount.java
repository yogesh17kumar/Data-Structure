package BasicArray;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0;i<n;i++){
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
