import java.util.Scanner;

public class URI_1047_game_time_with_minutes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int MINUTES_PER_HOUR = 60;
		int startMinute = scanner.nextInt() * MINUTES_PER_HOUR + scanner.nextInt();
		int endMinute = scanner.nextInt() * MINUTES_PER_HOUR + scanner.nextInt();

		int totalMinutes = 0;
		if (startMinute < endMinute) {
			totalMinutes = endMinute - startMinute;
		} else if (startMinute >= endMinute) {
			totalMinutes = endMinute + 24 * MINUTES_PER_HOUR - startMinute;
		}

		int totalHours = totalMinutes / MINUTES_PER_HOUR;
		totalMinutes = totalMinutes % MINUTES_PER_HOUR;
		System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");

		scanner.close();
	}
}