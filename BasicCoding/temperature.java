import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter celsius:");
        double c = sc.nextDouble();
        double f = (c*9/5)+32;
        System.out.println("Fahrenheit:"+f);
    }
}
