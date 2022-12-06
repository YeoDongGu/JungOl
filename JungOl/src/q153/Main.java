package q153;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;

			if (arr[i] == -1) {
				if (i + 1 <= 3) {
					for (int j = 0; j <= i - 1; j++) {
						System.out.printf("%d ", arr[j]);
					}

				} else {
					for (int k = i - 3; k <= i - 1; k++) {
						System.out.printf("%d ", arr[k]);
					}
				}

				break;
			}

		}
		sc.close();

	}

}
