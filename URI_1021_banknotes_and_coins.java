import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1021_banknotes_and_coins {

	public static void main(String[] args) {
		int[] banknotes = { 100, 50, 20, 10, 5, 2 };
		double[] coins = { 1.0, 0.5, 0.25, 0.1, 0.05, 0.01 };

		DecimalFormat df = new DecimalFormat("0.00");

		Scanner scanner = new Scanner(System.in);
		double money = scanner.nextDouble();
		
		final byte SHIFT = 100;
		int safeMoney = (int) (money * SHIFT);

		System.out.println("NOTAS:");
		for (int banknote : banknotes) {
			int safeBanknote = banknote * SHIFT;
			int quantity = safeMoney / safeBanknote;
			safeMoney %= safeBanknote;
			System.out.println(quantity + " nota(s) de R$ " + df.format(banknote));
		}

		System.out.println("MOEDAS:");
		for (double coin : coins) {
			int safeCoin = (int) (coin * SHIFT);
			int quantity = safeMoney / safeCoin;
			safeMoney %= safeCoin;
			System.out.println(quantity + " moeda(s) de R$ " + df.format(coin));
		}

		scanner.close();
	}
}
