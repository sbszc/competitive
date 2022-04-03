import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1036_bhaskaras_formula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		if (a == 0.0 || 4 * a * c > b * b) {
			System.out.println("Impossivel calcular");
		} else {
			double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

			DecimalFormat df = new DecimalFormat("0.00000");
			System.out.println("R1 = " + df.format(r1));
			System.out.println("R2 = " + df.format(r2));
		}

		scanner.close();
	}
}
