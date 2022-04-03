import java.util.Scanner;

public class URI_1016_distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int distance = scanner.nextInt();
		float xVelocity = 60.0f;
		float yVelocity = 90.0f;
		
		final short MINUTES_PER_HOUR = 60;
		int timeInMinutes = (int) (distance / (yVelocity - xVelocity) * MINUTES_PER_HOUR);

		System.out.println(timeInMinutes + " minutos");

		scanner.close();
	}
}
