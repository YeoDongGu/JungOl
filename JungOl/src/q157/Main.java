package q157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];
		int sum = 0;
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] % 5 == 0 && arr[i] != 0) {
				sum += arr[i];
				r++;
			}

			if (arr[i] == 0) {
				System.out.printf("Multiples of 5 : %d\n", r);
				System.out.printf("sum : %d\n", sum);
				System.out.printf("avg : %.1f\n", (double) sum / r);
				break;
			}
		}
		sc.close();
	}

}
