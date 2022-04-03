import java.util.Scanner;

public class URI_1221_fast_prime_number {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        short n = scanner.nextShort();
        for (short i = 0; i < n; i++) {
            int number = scanner.nextInt();

            boolean isPrime = true;
            double sqr = Math.sqrt(number);
            for (int j = 2; j < sqr; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        } 

        scanner.close();
    }
}
