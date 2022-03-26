import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1005_average_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double a_weight = 3.5;
		double b_weight = 7.5;
		double avg = (a * a_weight + b * b_weight) / (a_weight + b_weight);
		
		String formattedAvg = new DecimalFormat("0.00000").format(avg);
		System.out.println("MEDIA = " + formattedAvg);
	}
}
