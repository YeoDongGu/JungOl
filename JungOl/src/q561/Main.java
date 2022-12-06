package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int max = -1;
		int min = 10000;
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] < 100) {
				if (max < arr[i]) {
					max = arr[i];
				}
			} else if (arr[i] >= 100) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}

		}
		if (max == -1) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}

		sc.close();
		System.out.printf("%d %d", max, min);
	}

}
