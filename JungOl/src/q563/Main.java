package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
		sc.close();
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
