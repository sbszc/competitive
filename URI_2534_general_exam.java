import java.util.Arrays;
import java.util.Scanner;

public class URI_2534_general_exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext()) {
			final int N = scanner.nextInt();
			final int Q = scanner.nextInt();

			Integer[] grades = new Integer[N];
			for (int i = 0; i < N; i++) {
				grades[i] = scanner.nextInt();
			}
			Arrays.sort(grades, (o1, o2) -> o2 - o1);

			Integer[] queries = new Integer[Q];
			for (int i = 0; i < Q; i++) {
				queries[i] = scanner.nextInt();
			}
			for (int query : queries) {
				System.out.println(grades[query - 1]);
			}
		}
		scanner.close();
	}
}