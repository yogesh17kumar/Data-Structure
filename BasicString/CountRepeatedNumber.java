package StringBasic;

import java.util.Scanner;

public class CountRepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0;i<str.length();i++){
            int count= 1;
            if (str.charAt(i)==' ')
                continue;
            for (int j =i+1;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if (count>1){
                System.out.println(str.charAt(i)+" = "+count);
            }
        }
    }
}
