package ConditionalStatement;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter percentage:");
        double p = sc.nextDouble();
        if(p>=90){
            System.out.println("Grade A");
        } else if (p>=70) {
            System.out.println("Grade D");
        } else if (p>=50) {
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
}
