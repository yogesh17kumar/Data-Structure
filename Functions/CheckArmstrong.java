package Functions;

import java.util.Scanner;

public class CheckArmstrong {
    static boolean checkArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum = sum+(digit*digit*digit);
            n=n/10;
        }
        return original==sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(checkArmstrong(number)){
            System.out.println(number+" is an armstrong");
        }else {
            System.out.println(number+" is not an armstrong");
        }
    }
}
