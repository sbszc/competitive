import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1017_fuel_spent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int time = scanner.nextInt();
		int speed = scanner.nextInt();
		final float PERFORMANCE = 12.0f; 
		
		float liters = time * speed / PERFORMANCE;

		String formattedLiters = new DecimalFormat("0.000").format(liters);
		System.out.println(formattedLiters);
	}
}
