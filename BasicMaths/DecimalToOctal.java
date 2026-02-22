package BasicMath;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number: ");
        int decimal = sc.nextInt();
        int octal = 0;
        int place = 1;
        while(decimal>0){
            int remainder = decimal%8;
            octal += remainder*place;
            place *= 10;
            decimal /= 8;

        }
        System.out.println("Octal: "+octal);
    }
}
