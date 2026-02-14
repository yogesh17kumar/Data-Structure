package Loops;

public class SumOfPrime1to100 {
    public static void main(String[] args) {

        int sum = 0;

        for(int num=2; num<100;num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum = sum + num;
            }
        }
        System.out.println("Sum of Prime(1-100):"+sum);
    }
}
