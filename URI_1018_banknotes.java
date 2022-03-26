import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class URI_1018_banknotes {

	public static void main(String[] args) {
		int[] banknotes = { 100, 50, 20, 10, 5, 2, 1 };

		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator(',');
		DecimalFormat df = new DecimalFormat("0.00", dfs);

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(n);
		for (int banknote : banknotes) {
			int quantity = n / banknote;
			n -= banknote * quantity;
			System.out.println(quantity + " nota(s) de R$ " + df.format(banknote));
		}
	}
}
