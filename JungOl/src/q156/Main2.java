package q156;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int[] n = new int[100];
		int max = -1000;
		int min = 1000;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {
			n[i] = sc.nextInt();

			if (n[i] == 999) {
				System.out.println("max : " + max);
				System.out.println("min : " + min);
			} else if (n[i] > max) {
				max = n[i];
			} else if (n[i] < min) {
				min = n[i];
			}
		}
		sc.close();
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}