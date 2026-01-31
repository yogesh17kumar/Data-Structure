import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of first sub:");
        int a = sc.nextInt();
        System.out.println("enter marks of sec sub:");
        int b = sc.nextInt();
        System.out.println("enter marks of third sub:");
        int c = sc.nextInt();
        System.out.println("enter marks of forth sub:");
        int d = sc.nextInt();
        System.out.println("enter marks of fifth sub:");
        int e = sc.nextInt();
        int total = (a+b+c+d+e);
        double percentage = total/5.0;
        System.out.println("Total marks:"+total);
        System.out.println("Percentage:"+percentage);
    }
}
