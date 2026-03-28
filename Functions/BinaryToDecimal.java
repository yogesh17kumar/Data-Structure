package Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryTodecimal(int binary){
        int decimal = 0, base=1;
        while(binary!=0){
            int lastDigit = binary%10;
            decimal+=lastDigit*base;
            base *=2;
            binary /=10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int b = sc.nextInt();
        int result = binaryTodecimal(b);
        System.out.println("Decimal: "+result);
    }
}
