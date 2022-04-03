import java.util.Scanner;

public class URI_1019_time_conversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int seconds = scanner.nextInt();

		final int SECONDS_PER_MINUTE = 60;
		final int MINUTES_PER_HOUR = 60;
		final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

        int hours = seconds / SECONDS_PER_HOUR;
        seconds %= SECONDS_PER_HOUR;
        int minutes = seconds / MINUTES_PER_HOUR;
        seconds %= MINUTES_PER_HOUR;

		System.out.println(String.format("%d:%d:%d", hours, minutes, seconds));

		scanner.close();
	}
}
