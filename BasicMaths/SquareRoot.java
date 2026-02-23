package BasicMath;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        int odd = 1;
        while(n>0){
            n-=odd;
            odd+=2;
            count++;
        }
        System.out.println("Square root: "+count);
    }
}
