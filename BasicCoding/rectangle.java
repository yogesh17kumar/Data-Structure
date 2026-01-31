import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        double length = sc.nextDouble();
        System.out.println("enter breadth:");
        double breadth = sc.nextDouble();
        System.out.println("Area:"+length*breadth);
    }
}
