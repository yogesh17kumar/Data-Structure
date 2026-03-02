package StringBasic;

import java.util.Scanner;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
            if (freq[ch]==2){
                System.out.println("First repeated character: "+ch);
                return;
            }
        }
        System.out.println("No repeated character found");
    }
}
