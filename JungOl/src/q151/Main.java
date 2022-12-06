package q151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int inp = sc.nextInt();
			arr[i] = inp;
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		sc.close();
		System.out.println(sum);
	}

}
