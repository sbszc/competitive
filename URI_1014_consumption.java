import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1014_consumption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int distanceInKm = scanner.nextInt();
		float fuelInL = scanner.nextFloat();
		
		float consumption = distanceInKm / fuelInL;

		String formattedConsumption = new DecimalFormat("0.000").format(consumption);
		System.out.println(formattedConsumption + " km/l");

		scanner.close();
	}
}
