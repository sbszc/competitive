import java.util.Arrays;
import java.util.Scanner;

public class URI_1045_triangle_types {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		Double[] arrayToSort = { a, b, c };
		Arrays.sort(arrayToSort, (o1, o2) -> (int) (o2 - o1));
		a = arrayToSort[0];
		b = arrayToSort[1];
		c = arrayToSort[2];

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
			return;
		}

		double aSqr = a * a, bSqrPlusCSqr = b * b + c * c;
		if (aSqr == bSqrPlusCSqr) {
			System.out.println("TRIANGULO RETANGULO");
		} else if (aSqr > bSqrPlusCSqr) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if (aSqr < bSqrPlusCSqr) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		if (a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}