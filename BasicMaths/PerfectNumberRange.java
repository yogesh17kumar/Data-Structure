package BasicMath;

import java.util.Scanner;

public class PerfectNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start: ");
        int start = sc.nextInt();
        System.out.print("enter end: ");
        int end = sc.nextInt();
        System.out.println("Perfect numbers: ");
        for (int num = start; num<=end;num++){
            int sum = 0;
            for (int i=1;i<=num/2;i++){
                if (num%i==0){
                    sum+=i;
                }
            }
            if (sum==num&&num!=0){
                System.out.print(num+" ");
            }
        }

    }
}
