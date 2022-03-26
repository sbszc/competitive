import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1009_salary_with_bonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		scanner.next();
		double salary = scanner.nextDouble();
		double valueSold  = scanner.nextDouble();
		
		double totalSalary = salary + valueSold * 0.15;
		String formattedTotalSalary = new DecimalFormat("0.00").format(totalSalary);
		
		System.out.println("TOTAL = R$ " + formattedTotalSalary);
	}
}
