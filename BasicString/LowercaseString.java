package StringBasic;

import java.util.Scanner;

public class LowercaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String lower = str.toLowerCase();
        System.out.println("Lowercase: "+lower);
    }
}
