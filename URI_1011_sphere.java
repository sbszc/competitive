import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1011_sphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double r = scanner.nextDouble();
		final double PI = 3.14159;

		double volume = 4.0/3.0*PI*r*r*r;

		String formattedVolume = new DecimalFormat("0.000").format(volume);
		System.out.println("VOLUME = " + formattedVolume);
	}
}
