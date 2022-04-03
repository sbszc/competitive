import java.util.Scanner;

public class URI_1020_age_in_days {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		final int DAYS_PER_MONTH = 30;
		final int DAYS_PER_YEAR = 365;

		int years = n / DAYS_PER_YEAR;
		n -= years * DAYS_PER_YEAR;
		int months = n / DAYS_PER_MONTH;
		n -= months * DAYS_PER_MONTH;
		int days = n;

		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + " dia(s)");

		scanner.close();
	}
}
