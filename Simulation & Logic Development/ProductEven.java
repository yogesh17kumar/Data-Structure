package SimulationLogicDevelopment;

import java.util.Scanner;

public class ProductEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers whose digit product is even:");

        // Logic
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int product = 1;

            while (num > 0) {
                int digit = num % 10;
                product *= digit;
                num /= 10;
            }

            if (product % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}