package q562;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 10; i++) {
			int inp = sc.nextInt();

			if (i % 2 == 0) {
				sum1 += inp;
			} else {
				sum2 += inp;
			}
		}
		sc.close();

		System.out.printf("sum : %d\n", sum2);
		System.out.printf("avg : %.1f", (double) sum1 / 5);

	}

}
