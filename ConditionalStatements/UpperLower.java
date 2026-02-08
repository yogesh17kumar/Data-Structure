package ConditionalStatement;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  character:");
        char ch = sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("Character is in Uppercase");
        } else if (ch>='a'&&ch<='z') {
            System.out.println("In Lowercase");

        }else{
            System.out.println("Not an alphabet");
        }
    }
}
