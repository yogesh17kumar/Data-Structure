package Functions;

import java.util.Scanner;

public class decimalTobinary {
    static void DecimalToBinary(int n){
        int binary[] = new int[32];
        int i = 0;

        while(n > 0){
            binary[i] = n % 2;
            n /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal: ");
        int d = sc.nextInt();

        System.out.print("Binary: ");
        DecimalToBinary(d);
    }
}