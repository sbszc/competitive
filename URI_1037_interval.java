import java.util.Scanner;

public class URI_1037_interval {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float n = scanner.nextFloat();

		if (n>=0f && n<=25f) {
			System.out.println("Intervalo [0,25]");
		}else if (n>25f && n<=50f) {
			System.out.println("Intervalo (25,50]");
		}else if (n>50f && n<=75f) {
			System.out.println("Intervalo (50,75]");
		}else if (n>75f && n<=100f) {
			System.out.println("Intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}

		scanner.close();
	}
}
