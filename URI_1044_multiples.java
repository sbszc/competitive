import java.util.Scanner;

public class URI_1044_multiples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		scanner.close();
	}
}