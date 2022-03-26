import java.util.Scanner;

public class URI_1013_the_greatest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int val3 = scanner.nextInt();

		int higher1 = higher(val1, val2);
		int higher2 = higher(higher1, val3);

		System.out.println(higher2 + " eh o maior");
	}

	private static int higher(int a, int b) {
		return (a + b + Math.abs(a - b)) / 2;
	}
}
