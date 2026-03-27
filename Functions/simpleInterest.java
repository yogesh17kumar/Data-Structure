package Functions;

import java.util.Scanner;

public class simpleInterest {
    static double SimpleInterest(double p, double r, double t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p: ");
        double p = sc.nextDouble();
        System.out.print("Enter r: ");
        double r = sc.nextDouble();
        System.out.print("Enter t: ");
        double t = sc.nextDouble();
        double result = SimpleInterest(p,r,t);
        System.out.println("Simple Interest: "+result);
    }
}
