import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1012_area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		final double PI = 3.14159;

		double triangleArea = a * c / 2;
		double circleArea = PI * c * c;
		double trapeziumArea = (a + b) * c / 2;
		double squareArea = b * b;
		double rectangleArea = a * b;

		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println("TRIANGULO: " + df.format(triangleArea));
		System.out.println("CIRCULO: " + df.format(circleArea));
		System.out.println("TRAPEZIO: " + df.format(trapeziumArea));
		System.out.println("QUADRADO: " + df.format(squareArea));
		System.out.println("RETANGULO: " + df.format(rectangleArea));
		
		scanner.close();
	}
}
