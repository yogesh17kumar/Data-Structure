package BasicMath;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start: ");
        int start = sc.nextInt();
        System.out.println("enter end: ");
        int end = sc.nextInt();
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (num < 2) continue;
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
            System.out.println("Total no of Prime number: " + count);
        }
    }
