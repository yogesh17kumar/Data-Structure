package SimulationLogicDevelopment;

import java.util.Scanner;

public class SumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        // Input elements
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }

        // Output
        System.out.println("Sum = " + sum);
    }
}