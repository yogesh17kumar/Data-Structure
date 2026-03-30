package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumofPrimes {

    // Function to check prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Function to calculate sum of primes in range
    static int sumOfPrimes(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        int result = sumOfPrimes(start,end);

        System.out.println("Sum of prime numbers: " + result);
    }
}