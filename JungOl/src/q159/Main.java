package q159;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp = 0;

		for (int i = 0; i < n; i++) {
			int score = sc.nextInt();
			arr[i] = score;
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n - 1; k++) {
				if (arr[j] > arr[k]) {
					temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int a = 0; a < n; a++) {
			System.out.println(arr[a]);
		}
		sc.close();
	}

}
