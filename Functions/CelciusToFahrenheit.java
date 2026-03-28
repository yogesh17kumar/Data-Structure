package Functions;

import java.util.Scanner;

public class CelciusToFahrenheit {
    static double celciusTofahrenheit(double c){
        return (c*9/5)+32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celcius: ");
        double c = sc.nextDouble();
        double result = celciusTofahrenheit(c);
        System.out.println("Fahrenheit: "+result);
    }
}
