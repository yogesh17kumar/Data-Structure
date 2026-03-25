package Functions;

import java.util.Scanner;

public class CountDigits {
    static int countDigits(int n){
        int count = 0;
        if (n==0){
            count=1;
        }else {
            while(n!=0){
                count++;
                n=n/10;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = countDigits(number);
        System.out.println("Counted digits: "+result);
    }
}
