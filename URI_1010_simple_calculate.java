import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1010_simple_calculate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] prod1 = scanner.nextLine().split(" ");
		String[] prod2 = scanner.nextLine().split(" ");

		double valueToPay = Double.valueOf(prod1[1]) * Double.valueOf(prod1[2])
				+ Double.valueOf(prod2[1]) * Double.valueOf(prod2[2]);

		String formattedValueToPay = new DecimalFormat("0.00").format(valueToPay);
		System.out.println("VALOR A PAGAR: R$ " + formattedValueToPay);

		scanner.close();
	}
}
