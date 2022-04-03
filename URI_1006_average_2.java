import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1006_average_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double a_weight = 2.0;
		double b_weight = 3.0;
		double c_weight = 5.0;
		double avg = (a * a_weight + b * b_weight + c * c_weight) / (a_weight + b_weight + c_weight);
		
		String formattedAvg = new DecimalFormat("0.0").format(avg);
		System.out.println("MEDIA = " + formattedAvg);

		scanner.close();
	}
}
