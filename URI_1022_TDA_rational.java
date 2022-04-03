import java.util.Scanner;

public class URI_1022_TDA_rational {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		while(sc.hasNext()) {
			final short N = sc.nextShort();
			for (int i = 0; i < N; i++) {
				int n1 = sc.nextInt();
				sc.next();
				int d1 = sc.nextInt();
				String operator = sc.next();
				int n2 = sc.nextInt();
				sc.next();
				int d2 = sc.nextInt();

				int n = 0, d = 0;
				switch(operator){
					case "+":
						n = n1 * d2 + n2 * d1;
						d = d1 * d2;
						break;
					case "-":
						n = n1 * d2 - n2 * d1;
						d = d1 * d2;
						break;
					case "*":
						n = n1 * n2;
						d = d1 * d2;
						break;
					case "/":
						n = n1 * d2;
						d = d1 * n2;
						break;
				}

				int nReduced = 0, dReduced = 0;
				int initMcd = Math.abs(n);
				if (Math.abs(d) < initMcd) {
					initMcd = Math.abs(d);
				}

				for (int mcd = initMcd; mcd >= 2; mcd--) {
					if (n % mcd == 0 && d % mcd == 0) {
						nReduced = n / mcd;
						dReduced = d / mcd;
						break;
					}
				}	

				if (nReduced == 0) {
					nReduced = n;
					dReduced = d;
				}
				System.out.println(String.format("%d/%d = %d/%d", n, d, nReduced, dReduced));
			}
		}
		sc.close();
	}
}