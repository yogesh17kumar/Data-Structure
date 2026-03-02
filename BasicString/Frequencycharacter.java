package StringBasic;

import java.util.Scanner;

public class Frequencycharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int[] freq = new int[256];
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch!=' '){
                freq[ch]++;
            }
        }
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch!=' '&&freq[ch]!=0){
                System.out.println(ch + " = "+freq[ch]);
                freq[ch]=0;
            }
        }
    }
}
