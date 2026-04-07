package SimulationLogicDevelopment;

import java.util.Scanner;

public class CheckAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAP = true;
        int diff = arr[1] - arr[0];

        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                isAP = false;
                break;
            }
        }

        if (isAP)
            System.out.println("Array is in AP");
        else
            System.out.println("Array is NOT in AP");

        sc.close();
    }
}