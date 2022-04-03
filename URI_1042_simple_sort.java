import java.util.Arrays;
import java.util.Scanner;

public class URI_1042_simple_sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int[] inputArr = {a, b, c};
		Arrays.sort(inputArr);
		
		System.out.println(inputArr[0]);
		System.out.println(inputArr[1]);
		System.out.println(inputArr[2]);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		scanner.close();
	}
}