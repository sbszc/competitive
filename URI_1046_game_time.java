import java.util.Scanner;

public class URI_1046_game_time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startHour = scanner.nextInt();
		int endHour = scanner.nextInt();

		int totalHours = 0;
		if (startHour < endHour) {
			totalHours = endHour - startHour;
		} else if (startHour >= endHour) {
			totalHours = endHour + 24 - startHour;
		}
		System.out.println("O JOGO DUROU " + totalHours + " HORA(S)");

		scanner.close();
	}
}