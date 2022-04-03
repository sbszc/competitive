import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1043_triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();

		DecimalFormat df = new DecimalFormat("0.0");
		if (a + b > c && a + c > b && b + c > a) {
			float trianglePerimeter = a + b + c;
			System.out.println("Perimetro = " + df.format(trianglePerimeter));
		} else {
			float trapeziumArea = (a + b) * c / 2;
			System.out.println("Area = " + df.format(trapeziumArea));
		}

		scanner.close();
	}
}