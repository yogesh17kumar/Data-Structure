import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        double radius = sc.nextDouble();
        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference of circle:"+ circumference);
    }
}
