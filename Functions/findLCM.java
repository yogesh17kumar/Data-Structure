package Functions;

import java.util.Scanner;

public class findLCM {
    static int lcm(int a, int b){
        int max=Math.max(a,b);
        while(true){
            if(max%a==0&&max%b==0){
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        int result = lcm(a,b);
        System.out.println("LCM: "+result);
    }
}
