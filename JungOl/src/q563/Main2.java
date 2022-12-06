package q563;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;
		}
		sc.close();

		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
