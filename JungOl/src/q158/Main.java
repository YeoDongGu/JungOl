package q158;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0) {

				System.out.println(i);
				for (int j = 0; j <= i; j++) {
					if (arr[j] % 2 != 0) {
						System.out.printf("%d ", arr[j] * 2);
					} else if (arr[j] % 2 == 0 && arr[j] != 0) {
						System.out.printf("%d ", arr[j] / 2);
					}
				}
				break;
			}
		}
		sc.close();

	}

}
