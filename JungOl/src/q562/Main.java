package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;

			if (i % 2 == 0) {
				sum1 += arr[i];
			} else {
				sum2 += arr[i];
			}

		}
		sc.close();

		System.out.printf("sum : %d\n", sum2);
		System.out.printf("avg : %.1f", (double) sum1 / 5);

	}

}
