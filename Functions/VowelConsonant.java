package Functions;

import java.util.Scanner;

public class VowelConsonant {

    // Function to check vowel or consonant
    static void checkChar(char ch) {

        ch = Character.toLowerCase(ch); // convert to lowercase

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Not an alphabet");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        checkChar(ch);
    }
}