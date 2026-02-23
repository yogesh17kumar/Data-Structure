package BasicMath;

import java.util.Scanner;

public class NCrManually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int n = sc.nextInt();
        System.out.println("enter second number: ");
        int r = sc.nextInt();
        int factN = 1, factR = 1,factNR = 1;
        for (int i = 1; i<=n;i++) {
            factN *= i;
        }
        for (int i = 1; i<=r;i++){
            factR *= i;
        }
        for (int i = 1; i<=n-r; i++){
            factNR *= i;
        }
        int nCr = factN / (factR * factNR);
        System.out.println("nCr :"+nCr);
    }
}
