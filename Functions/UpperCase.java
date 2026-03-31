package Functions;

import java.util.Scanner;

public class UpperCase {


    static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        String result = toUpperCase(input);
        System.out.println("Uppercase String: " + result);
    }
}