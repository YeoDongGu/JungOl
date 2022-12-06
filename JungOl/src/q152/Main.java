package q152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int odd = 0;
		int even = 0;
		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;

			if (i % 2 == 0) {
				odd += arr[i];
			} else {
				even += arr[i];
			}
		}
		sc.close();

		System.out.printf("odd : %d\n", odd);
		System.out.printf("even : %d", even);

	}

}
