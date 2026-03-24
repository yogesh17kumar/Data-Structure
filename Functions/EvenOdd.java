package Functions;

import java.util.Scanner;

public class EvenOdd {
    static String checkEvenOdd(int num){
        if(num%2==0)
            return "even";
        else
            return "odd";
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        String result = checkEvenOdd(number);
        System.out.println("Check Even or Odd: "+result);
    }
    }

