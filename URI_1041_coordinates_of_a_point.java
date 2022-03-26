import java.util.Scanner;

public class URI_1041_coordinates_of_a_point {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo Y");
		} else if (x != 0.0 && y == 0.0) {
			System.out.println("Eixo X");
		} else if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}

	}
}