import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1040_average_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		double n4 = scanner.nextDouble();

		int n1Weight = 2;
		int n2Weight = 3;
		int n3Weight = 4;
		int n4Weight = 1;
		
		double avg = (n1 * n1Weight + n2 * n2Weight + n3 * n3Weight
				+ n4 * n4Weight) / (n1Weight + n2Weight + n3Weight + n4Weight);

		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("Media: " + df.format(avg));
		
		if (7.0 <= avg) {
			System.out.println("Aluno aprovado.");
		} else if (avg < 5.0) {
			System.out.println("Aluno reprovado.");
		} else if (5.0 <= avg && avg <= 6.9) {
			System.out.println("Aluno em exame.");
			double nExam = scanner.nextDouble();
			System.out.println("Nota do exame: " + df.format(nExam));
			avg = (avg + nExam) / (2);
			if (5.0 <= avg) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(avg));
		}

		scanner.close();
	}
}