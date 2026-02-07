package ConditionalStatement;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks:");
        int n = sc.nextInt();
        if(n>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
