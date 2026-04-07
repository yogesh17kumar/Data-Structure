package SimulationLogicDevelopment;

import java.util.Scanner;

public class CheckGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isGP = true;

        if (arr[0] == 0) {
            isGP = false; // avoid division by zero
        } else {
            int ratio = arr[1] / arr[0];

            for (int i = 2; i < n; i++) {
                if (arr[i] != arr[i - 1] * ratio) {
                    isGP = false;
                    break;
                }
            }
        }

        if (isGP)
            System.out.println("Array is in GP");
        else
            System.out.println("Array is NOT in GP");

        sc.close();
    }
}