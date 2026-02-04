package ConditionalStatement;

import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        n = Math.abs(n);
        if(n>=0&&n<=9){
            System.out.println("1-Digit");
        }else if(n>=10&&n<=99){
            System.out.println("2-Digit");
        } else if (n>=100&&n<=999) {
            System.out.println("3-Digit");
        }else{
            System.out.println("Number is more than 3-Digit");
        }
    }
}
