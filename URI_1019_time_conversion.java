import java.util.Scanner;

public class URI_1019_time_conversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		final int SECONDS_PER_MINUTE = 60;
		final int MINUTES_PER_HOUR = 60;

		int hours = n / (SECONDS_PER_MINUTE * MINUTES_PER_HOUR);
		n -= hours * SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
		int minutes = n / SECONDS_PER_MINUTE;
		n -= minutes * SECONDS_PER_MINUTE;
		int seconds = n;

		System.out.println(String.format("%d:%d:%d", hours, minutes, seconds));
	}
}
