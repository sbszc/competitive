import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class URI_1038_snack {

	public static void main(String[] args) {
		HashMap<Integer, Float> items = new HashMap();
		items.put(1, 4.0f);
		items.put(2, 4.5f);
		items.put(3, 5.0f);
		items.put(4, 2.0f);
		items.put(5, 1.5f);

		Scanner scanner = new Scanner(System.in);
		int itemCode = scanner.nextInt();
		int amount = scanner.nextInt();

		double total = items.get(itemCode) * amount;
		
		String formattedTotal = new DecimalFormat("0.00").format(total);
		System.out.println("Total: R$ " + formattedTotal);
	}
}