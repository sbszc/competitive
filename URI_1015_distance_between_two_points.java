import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1015_distance_between_two_points {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		String formattedDistance = new DecimalFormat("0.0000").format(distance);
		System.out.println(formattedDistance);
	}
}
