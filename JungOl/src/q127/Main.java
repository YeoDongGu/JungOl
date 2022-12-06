package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		int sum = 0;

		while (true) {
			int inp = sc.nextInt();
			if (inp > 100 || inp < 0) {
				System.out.printf("sum : %d\n", sum);
				System.out.printf("avg : %.1f", (double) (sum) / (r));
				break;
			}
			sum += inp;
			r++;
		}
		sc.close();

	}

}
