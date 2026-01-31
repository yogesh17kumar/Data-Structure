import java.util.Scanner;

public class temperaturef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fahrenheit:");
        double f = sc.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Celsius:"+c);
    }
}
