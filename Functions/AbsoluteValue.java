package Functions;

import java.util.Scanner;

public class AbsoluteValue {

    // Function to find absolute value
    static int absolute(int num) {
        if (num < 0)
            return -num;
        else
            return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = absolute(num);
        System.out.println("Absolute value: " + result);
    }
}