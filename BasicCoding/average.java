import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no:");
        int a = sc.nextInt();
        System.out.println("enter second no:");
        int b = sc.nextInt();
        System.out.println("enter third no:");
        int c = sc.nextInt();
        double avg = (a+b+c)/3.0;
        System.out.println("Average:"+avg);
    }
}
