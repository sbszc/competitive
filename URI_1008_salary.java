import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1008_salary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int emplNumber = scanner.nextInt();
		int workedHoursPerMonth = scanner.nextInt();
		float salaryPerHour  = scanner.nextFloat();
		
		float salaryPerMonth = salaryPerHour * workedHoursPerMonth;
		String formattedSalaryPerMonth = new DecimalFormat("0.00").format(salaryPerMonth);
		
		System.out.println("NUMBER = " + emplNumber);
		System.out.println("SALARY = U$ " + formattedSalaryPerMonth);

		scanner.close();
	}
}
